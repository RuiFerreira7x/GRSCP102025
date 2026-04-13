#Cria uma dicionário com Nome e nota final e vai criando alunos, apagar alunos e acrescentando ao ficheiro alunos.txt

def carregar_alunos():
    alunos = {}

    try:
        with open("alunos.txt", "r", encoding="utf-8") as f:
            for linha in f:
                linha = linha.strip()
                if ":" in linha:
                    nome, nota = linha.split(":")
                    alunos[nome] = float(nota)
    except FileNotFoundError:
        pass  # Se não existir, começa vazio

    return alunos


def guardar_alunos(alunos):
    with open("alunos.txt", "w", encoding="utf-8") as f:
        for nome, nota in alunos.items():
            f.write(f"{nome}:{nota}\n")


def criar_aluno(alunos):
    print("\n--- Criar aluno ---")
    nome = input("Nome do aluno: ")

    if nome in alunos:
        print("Esse aluno já existe.")
        return

    nota = float(input("Nota final: "))
    alunos[nome] = nota
    guardar_alunos(alunos)

    print("Aluno criado com sucesso!")


def apagar_aluno(alunos):
    print("\n--- Apagar aluno ---")
    nome = input("Nome do aluno a apagar: ")

    if nome not in alunos:
        print("Esse aluno não existe.")
        return

    del alunos[nome]
    guardar_alunos(alunos)

    print("Aluno apagado com sucesso!")


def listar_alunos(alunos):
    print("\n--- Lista de alunos ---")
    if not alunos:
        print("Nenhum aluno registado.")
        return

    for nome, nota in alunos.items():
        print(f"{nome} → {nota}")


def main():
    alunos = carregar_alunos()

    while True:
        print("\n---------- MENU ----------")
        print("1 - Criar aluno")
        print("2 - Apagar aluno")
        print("3 - Listar todos os registos")
        print("4 - Sair")

        opcao = input("Escolha uma opção: ")

        if opcao == "1":
            criar_aluno(alunos)
        elif opcao == "2":
            apagar_aluno(alunos)
        elif opcao == "3":
            listar_alunos(alunos)
        elif opcao == "4":
            print("A sair do programa. Até logo!")
            break
        else:
            print("Opção inválida.")


main()
