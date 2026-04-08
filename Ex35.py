#criar um dicionario de filmes
filmes = {
    "inception": {
        "ano": 2010,
        "genero": "Ficção Científica",
        "classificacoes": [9, 8, 10]
    },
    "titanic": {
        "ano": 1997,
        "genero": "Romance",
        "classificacoes": [8, 9, 7]
    }
}
while True:
    print("\n -----------MENU-----------")
    print("1. Adicionar filme")
    print("2. Listar filmes")
    print("3. Ver dados de um filme")
    print("4. Adicionar classificação")
    print("5. Calcular média de um filme")
    print("6. Atualizar género")
    print("7. Remover filme")
    print("0. Sair")

    opcao = input("\n Escolha uma opção: ")
    match opcao:
        
        case "1":
            nome = input("Digite o nome do filme: ")
            ano = int(input("Digite o ano de lançamento: "))
            genero = input("Digite o género do filme: ")
            filmes[nome] = {"ano": ano, "genero": genero, "classificacoes": []}
            print(f"Filme {nome} adicionado com sucesso.")
        case "2":
            print("\nFilmes disponíveis:")
            for nome, dados in filmes.items():
                print(f"- {nome} ({dados['ano']}) - {dados['genero']}")
        case "3":
            nome = input("Digite o nome do filme para ver os dados: ")
            if nome in filmes:
                dados = filmes[nome]
                print(f"\nDados do filme '{nome}':")
                print(f"Ano de lançamento: {dados['ano']}")
                print(f"Género: {dados['genero']}")
                print(f"Classificações: {dados['classificacoes']}")
            else:
                print(f"Filme '{nome}' não encontrado.")
        case "4":
            nome = input("Digite o nome do filme para adicionar uma classificação: ")
            if nome in filmes:
                classificacao = int(input("Digite a classificação (1-10): "))
                if 1 <= classificacao <= 10:
                    filmes[nome]["classificacoes"].append(classificacao)
                    print(f"Classificação adicionada ao filme '{nome}'.")
                else:
                    print("Classificação inválida. Deve ser um número entre 1 e 10.")
            else:
                print(f"Filme '{nome}' não encontrado.")
        case "5":
            nome = input("Digite o nome do filme para calcular a média: ")
            if nome in filmes:
                classificacoes = filmes[nome]["classificacoes"]
                if classificacoes:
                    media = sum(classificacoes) / len(classificacoes)
                    print(f"A média do filme '{nome}' é: {media:.2f}")
                else:
                    print(f"O filme '{nome}' não possui classificações.")
            else:
                print(f"Filme '{nome}' não encontrado.")
        case "6":
            nome = input("Digite o nome do filme para atualizar o género: ")
            if nome in filmes:
                novo_genero = input("Digite o novo género do filme: ")
                filmes[nome]["genero"] = novo_genero
                print(f"Género do filme '{nome}' atualizado para: {novo_genero}")
            else:
                print(f"Filme '{nome}' não encontrado.")
        case "7":
            nome = input("Digite o nome do filme para remover: ")
            if nome in filmes:
                del filmes[nome]
                print(f"Filme '{nome}' removido com sucesso.")
            else:
                print(f"Filme '{nome}' não encontrado.")
        case "0":
            print("A Sair do programa. Até um dia!")
            break