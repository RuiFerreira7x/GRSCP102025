#criar um dicionario com a temperatura para cada cidade
temperaturas = {"Lisboa": 25, "Porto": 22, "Coimbra": 24}

while True:
    print("\n -----------MENU-----------")
    print("1. Listar cidades e temperaturas")
    print("2. Adicionar/Atualizar temperatura de uma cidade")
    print("3. Apagar uma cidade")
    print("4. Editar temperatura")
    print("5. Consultar temperatura de uma cidade")
    print("0. Sair")
    
    escolha = input("\nEscolha uma opção: ")
    if escolha == "1":
        print("\nCidades e suas temperaturas:")
        for cidade, temp in temperaturas.items():
            print(f"{cidade}: {temp}°C")
    
    elif escolha == "2":
        cidade = input("Digite o nome da cidade: ")
        temp = int(input("Digite a temperatura: "))
        temperaturas[cidade] = temp
        print(f"Temperatura de {cidade} atualizada para {temp}°C.")
    
    elif escolha == "3":
        cidade = input("Digite o nome da cidade para ser apagada: ")
        if cidade in temperaturas:
            del temperaturas[cidade]
            print(f"{cidade} foi apagada do dicionário.")
        else:
            print(f"{cidade} não encontrada no dicionário.")
    
    elif escolha == "4":
        cidade = input("Digite o nome da cidade para editar a temperatura: ")
        if cidade in temperaturas:
            temp = int(input("Digite a nova temperatura: "))
            temperaturas[cidade] = temp
            print(f"Temperatura de {cidade} atualizada para {temp}°C.")
        else:
            print(f"{cidade} não encontrada no dicionário.")
    
    elif escolha == "5":
        cidade = input("Digite o nome da cidade para consultar a temperatura: ")
        if cidade in temperaturas:
            print(f"A temperatura de {cidade} é {temperaturas[cidade]}°C.")
        else:
            print(f"{cidade} não encontrada no dicionário.")
    
    elif escolha == "0":
        print("A Desligar. Até um dia!")
        break
    
    else:
        print("Opção inválida. Por favor, tente novamente.")