#Cria uma programa que tenha uma ficheiro os dados username password.  Faça um sistema de login que valide segundo os dados desse ficheiro.

def carregar_utilizadores():
    utilizadores = {}

    with open("users.txt", "r", encoding="utf-8") as f:
        for linha in f:
            linha = linha.strip()

            if ":" in linha:
                user, pwd = linha.split(":")
                utilizadores[user] = pwd

    return utilizadores


def login(utilizadores):
    print("\n--- Login ---")
    username = input("Username: ")
    password = input("Password: ")

    if username in utilizadores and utilizadores[username] == password:
        print("Login efetuado com sucesso!")
    else:
        print("Credenciais inválidas.")


def main():
    utilizadores = carregar_utilizadores()
    login(utilizadores)


main()
