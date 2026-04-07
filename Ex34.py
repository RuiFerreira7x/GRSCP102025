#criar programa listar produtos e seus preços
produtos = {
    "Arroz":{"preço":1.2, "stock":50},
    "Leite":{"preço":0.9, "stock":30},
    "Pão":{"preço":0.2, "stock":100}
}

while True:
    print("\n -----------MENU-----------")
    print("1. Listar produto")
    print("2. Adicionar produto")
    print("3. Alterar preço")
    print("4. Vender produto (diminuir stock)")
    print("5. Ver produto com maior preço")
    print("6. Ver produto com menor preço")
    print("7. Ver valor total do stock")
    print("8- Preço medio do produtos")
    print("0. Sair")

    opcao = input("\nEscolha uma opção: ")

    if opcao == '1':
        print("\nProdutos e seus preços:")
        for produto, info in produtos.items():
            print(f"{produto}: R${info['preço']:.2f}, Stock: {info['stock']}")
    elif opcao == '2':
        nome = input("Digite o nome do produto: ")
        preco = float(input("Digite o preço do produto: "))
        stock = int(input("Digite a quantidade em stock: "))
        produtos[nome] = {"preço": preco, "stock": stock}
        print(f"Produto {nome} adicionado com preço R${preco:.2f} e stock {stock}.")
    elif opcao == '3':
        nome = input("Digite o nome do produto para alterar o preço: ")
        if nome in produtos:
            preco = float(input("Digite o novo preço do produto: "))
            produtos[nome]['preço'] = preco
            print(f"Preço de {nome} atualizado para R${preco:.2f}.")
        else:
            print(f"Produto {nome} não encontrado.")
    elif opcao == '4':
        nome = input("Digite o nome do produto para vender: ")
        if nome in produtos:
            quantidade = int(input("Digite a quantidade a vender: "))
            if quantidade <= produtos[nome]['stock']:
                produtos[nome]['stock'] -= quantidade
                print(f"{quantidade} unidades de {nome} vendidas. Stock restante: {produtos[nome]['stock']}.")
            else:
                print(f"Stock insuficiente para vender {quantidade} unidades de {nome}.")
        else:
            print(f"Produto {nome} não encontrado.")
    elif opcao == '5':
        if produtos:
            produto_mais_caro = max(produtos, key=lambda x: produtos[x]['preço'])
            print(f"Produto com maior preço: {produto_mais_caro} - R${produtos[produto_mais_caro]['preço']:.2f}")
        else:
            print("Nenhum produto encontrado.")
    elif opcao == '6':
        if produtos:
            produto_mais_barato = min(produtos, key=lambda x: produtos[x]['preço'])
            print(f"Produto com menor preço: {produto_mais_barato} - R${produtos[produto_mais_barato]['preço']:.2f}")
        else:
            print("Nenhum produto encontrado.")
    elif opcao == '7':
        if produtos:
            valor_total = sum(info['preço'] * info['stock'] for info in produtos.values())
            print(f"Valor total do stock: R${valor_total:.2f}")
        else:
            print("Nenhum produto encontrado.")
    elif opcao == '8':
        if produtos:
            preco_medio = sum(info['preço'] for info in produtos.values()) / len(produtos)
            print(f"Preço médio dos produtos: R${preco_medio:.2f}")
        else:
            print("Nenhum produto encontrado.")
    elif opcao == '0':
        print("Saindo do programa. Até um dia!")
        break