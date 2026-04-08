#cria um dicionario para ver qual a idade e o clube 
clubes = {
    "FC Porto": [41, 34, 33, 32, 30, 28, 25, 22, 20, 18],
    "Benfica": [38,35, 34, 31, 30, 29, 27, 24, 21, 18],
    "Sporting": [37, 33, 32, 30, 28, 27, 25, 23, 20, 18]
}

while True:
    print("\n---------- MENU ----------")
    print("1 - Listar clubes")
    print("2 - Ver idades de um clube")
    print("3 - Adicionar um clube")
    print("4 - Alterar as idades de um clube")
    print("5 - Remover clube")
    print("6 - Mostrar a maior idade de um clube escolhido")
    print("7 - Mostrar a maior idade entre todos os clubes")
    print("0 - Sair")

    opção = input("\nEscolha uma opção: ")

    match opção:
        case "1":
                if clubes:
                   print("\nClubes disponíveis:")
                   for clube in clubes.keys():
                       print(clube)
                else:
                    print("Nenhum clube encontrado.")
        case "2":
            clube = input("Digite o nome do clube para ver as idades: ")
            if clube in clubes:
                print(f"As idades dos jogadores do {clube} são: {clubes[clube]}")
            else:
                print(f"Clube {clube} não encontrado.")
        case "3":
            clube = input("Digite o nome do clube a ser adicionado: ")
            idades = input("Digite as idades dos jogadores (separadas por vírgula): ")
            idades_lista = [int(idade.strip()) for idade in idades.split(",")]
            clubes[clube] = idades_lista
            print(f"Clube {clube} adicionado com idades: {idades_lista}.")
        case "4":
            clube = input("Digite o nome do clube para alterar as idades: ")
            if clube in clubes:
                idades = input("Digite as novas idades dos jogadores (separadas por vírgula): ")
                idades_lista = [int(idade.strip()) for idade in idades.split(",")]
                clubes[clube] = idades_lista
                print(f"Idades do clube {clube} atualizadas para: {idades_lista}.")
            else:
                print(f"Clube {clube} não encontrado.")
        case "5":
            clube = input("Digite o nome do clube a ser removido: ")
            if clube in clubes:
                del clubes[clube]
                print(f"Clube {clube} removido.")
            else:
                print(f"Clube {clube} não encontrado.")
        case "6":
            clube = input("Digite o nome do clube para mostrar a maior idade: ")
            if clube in clubes:
                maior_idade = max(clubes[clube])
                print(f"A maior idade do {clube} é: {maior_idade}")
            else:
                print(f"Clube {clube} não encontrado.")
        case "7":
            if clubes:
                maior_idade_geral = max(max(idades) for idades in clubes.values())
                print(f"A maior idade entre todos os clubes é: {maior_idade_geral}")
            else:
                print("Nenhum clube encontrado.")
        case "0":
            print("Sair do programa. Até um dia!")