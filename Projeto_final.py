import datetime
from getpass import getpass
# ------------------ FICHEIROS ------------------

def carregar_clientes():
    clientes = {}
    try:
        with open("clientes.txt", "r", encoding="utf-8") as f:
            for linha in f:
                linha = linha.strip()
                if linha:
                    user, pin, saldo = linha.split(";")
                    clientes[user] = {"pin": pin, "saldo": float(saldo)}
    except FileNotFoundError:
        pass
    return clientes


def guardar_clientes(clientes):
    with open("clientes.txt", "w", encoding="utf-8") as f:
        for user, dados in clientes.items():
            f.write(f"{user};{dados['pin']};{dados['saldo']}\n")


def registar_movimento(username, tipo, valor, descricao="", destino="-"):
    data = datetime.datetime.now().strftime("%Y-%m-%d %H:%M")
    with open("movimentos.txt", "a", encoding="utf-8") as f:
        f.write(f"{username};{tipo};{valor};{data};{descricao};{destino}\n")


def carregar_movimentos():
    movimentos = []
    try:
        with open("movimentos.txt", "r", encoding="utf-8") as f:
            for linha in f:
                linha = linha.strip()
                if linha:
                    user, tipo, valor, data, desc, dest = linha.split(";")
                    movimentos.append({
                        "user": user,
                        "tipo": tipo,
                        "valor": float(valor),
                        "data": data,
                        "descricao": desc,
                        "destino": dest
                    })
    except FileNotFoundError:
        pass
    return movimentos


# ------------------ FUNÇÕES DO UTILIZADOR ------------------

def consultar_saldo(user, clientes):
    saldo = clientes[user]["saldo"]
    print(f"Saldo atual: € {saldo:.2f}")


def levantar(user, clientes):
    try:
        valor = float(input("Valor a levantar: "))
        if valor < 10:
            print("Levantamento mínimo: €10")
            return
        if valor > clientes[user]["saldo"]:
            print("Saldo insuficiente.")
            return
        if valor > 500:
            confirmar = input(f"Confirma levantamento de € {valor:.2f}? (s/n): ")
            if confirmar.lower() != "s":
                print("Operação cancelada.")
                return
        clientes[user]["saldo"] -= valor
        guardar_clientes(clientes)
        registar_movimento(user, "Levantamento", valor, "Levantamento em numerário")
        print(f"Levantamentos realizado. Novo saldo: € {clientes[user]['saldo']:.2f}")
    except:
        print("Valor inválido.")


def depositar(user, clientes):
    try:
        valor = float(input("Valor a depositar: "))
        if valor <= 0:
            print("Valor inválido.")
            return
        clientes[user]["saldo"] += valor
        guardar_clientes(clientes)
        registar_movimento(user, "Depósito", valor, "Depósito em numerário")
        print(f"Depósito realizado. Novo saldo: € {clientes[user]['saldo']:.2f}")
    except:
        print("Valor inválido.")


def transferir(user, clientes):
    destino = input("Conta destino: ")
    if destino not in clientes:
        print("Conta destino inexistente.")
        return

    try:
        valor = float(input("Valor a transferir: "))
        if valor > clientes[user]["saldo"]:
            print("Saldo insuficiente.")
            return
        if valor > 500:
            confirmar = input(f"Confirma levantamento de € {valor:.2f}? (s/n): ")
            if confirmar.lower() != "s":
                print("Operação cancelada.")
                return

        clientes[user]["saldo"] -= valor
        clientes[destino]["saldo"] += valor
        guardar_clientes(clientes)

        registar_movimento(user, "Transferência", valor, "Transferência enviada", destino)
        registar_movimento(destino, "Transferência Recebida", valor, "Transferência recebida", user)

        print(f"Transferência de €{valor:.2f} para {destino} realizada com sucesso. Novo saldo: € {clientes[user]['saldo']:.2f}")
    except:
        print("Valor inválido.")


def consultar_movimentos(user):
    movimentos = carregar_movimentos()
    user_movs = [m for m in movimentos if m["user"] == user]

    if not user_movs:
        print("Nenhum movimento registado.")
        return

    print("\n--- Últimos movimentos ---")
    for m in user_movs[-10:]:
        print(f"{m['data']} - {m['tipo']}: €{m['valor']:.2f} ({m['descricao']})")


# ------------------ ADMIN ------------------

def criar_cliente(clientes):
    user = input("Novo username: ")
    if user in clientes:
        print("Cliente já existe.")
        return

    pin = input("PIN (4 dígitos): ")
    saldo = 1000  # saldo inicial

    clientes[user] = {"pin": pin, "saldo": saldo}
    guardar_clientes(clientes)
    print("Cliente criado com sucesso.")


def listar_clientes(clientes):
    print("\n--- Lista de clientes ---")
    for user, dados in clientes.items():
        print(f"{user} → Saldo: €{dados['saldo']:.2f}")


def pesquisar_movimentos():
    user = input("Pesquisar movimentos de: ")
    movimentos = carregar_movimentos()
    filtrados = [m for m in movimentos if m["user"] == user]

    if not filtrados:
        print("Sem movimentos.")
        return

    for m in filtrados:
        print(f"{m['data']} - {m['tipo']} €{m['valor']:.2f} ({m['descricao']})")


def delete_cliente(clientes):
    user = input("Cliente a remover: ")
    if user not in clientes:
        print("Cliente não existe.")
        return

    del clientes[user]
    guardar_clientes(clientes)
    print("Cliente removido.")


def estatisticas():
    movimentos = carregar_movimentos()
    if not movimentos: 
     print("Sem movimentos registados.") 
     return 
     total = sum(m["valor"] for m in movimentos) 
     depositos = sum(m["valor"] for m in movimentos if m["tipo"] == "Depósito") 
     levantamentos = sum(m["valor"] for m in movimentos if m["tipo"] == "Levantamento")
     transferencias = sum(m["valor"] for m in movimentos if m["tipo"] == "Transferência")
     print(f"Total movimentado: € {total:.2f}") 
     print(f"Total em depósitos: € {depositos:.2f}")
     print(f"Total em levantamentos: € {levantamentos:.2f}") 
     print(f"Total em transferências: € {transferencias:.2f}") 
     print(f"Número de transações: {len(movimentos)}")


# ------------------ MENUS ------------------

def menu_user(user, clientes):
    while True:
        print("\n--- MENU UTILIZADOR ---")
        print("1. Consultar Saldo")
        print("2. Levantamento")
        print("3. Depósito")
        print("4. Transferência")
        print("5. Movimentos")
        print("6. Sair")

        op = input("Opção: ")

        if op == "1": consultar_saldo(user, clientes)
        elif op == "2": levantar(user, clientes)
        elif op == "3": depositar(user, clientes)
        elif op == "4": transferir(user, clientes)
        elif op == "5": consultar_movimentos(user)
        elif op == "6":
            print("Obrigado por usar o Multibanco. Volte sempre!")
            break
        else: print("Opção inválida.")


def menu_admin(clientes):
    while True:
        print("\n--- MENU ADMIN ---")
        print("1. Criar Cliente")
        print("2. Listar Clientes")
        print("3. Pesquisar Movimentos")
        print("4. Delete Cliente")
        print("5. Estatísticas")
        print("6. Sair")

        op = input("Opção: ")

        if op == "1": criar_cliente(clientes)
        elif op == "2": listar_clientes(clientes)
        elif op == "3": pesquisar_movimentos()
        elif op == "4": delete_cliente(clientes)
        elif op == "5": estatisticas()
        elif op == "6":
            print("Obrigado por usar o Multibanco. Volte sempre!")
            break
        else: print("Opção inválida.")


# ------------------ LOGIN ------------------

def login(clientes):
    print("\n----- Bem-vindo ao Sistema de Multibanco -----")
    print("\n----- LOGIN -----")

    tentativas = 0


    while tentativas < 3:
        user = input("Username: ")
        pin = getpass("PIN: ")

        if user == "admin" and pin == "0000":
             menu_admin(clientes)
        return


        if user in clientes and clientes[user]["pin"] == pin:
            menu_user(user, clientes)
        return

        tentativas += 1
        restantes = 3 - tentativas


        if restantes > 0:
            print(f"Credenciais inválidas. Tentativas restantes: {restantes}")

    print("Número de tentativas excedido. Sistema bloqueado.")


# ------------------ MAIN ------------------

def main():
    clientes = carregar_clientes()

    while True:
        login(clientes)


main()
