#Cria um programa para gerir alunos e as sua nota
alunos = {}
nota = {}
while True:
    print("\n -----------MENU-----------")
    print("1. Listar alunos")
    print("2. Adicionar aluno")
    print("3. Remover aluno")
    print("4. Atualizar nota")
    print("5. Ver nota de um aluno")
    print("6. Mostrar média das notas")
    print("0. Sair")
    
    escolha = input("\nEscolha uma opção: ")
    
    if escolha == "1":
        print("\nAlunos e suas notas:")
        for aluno, nota in alunos.items():
            print(f"{aluno}: {nota}")
    elif escolha == "2":
        aluno = input("Digite o nome do aluno: ")
        nota = float(input("Digite a nota do aluno: "))
        alunos[aluno] = nota
        print(f"Aluno {aluno} adicionado com nota {nota}.")
    elif escolha == "3":
        aluno = input("Digite o nome do aluno a ser removido: ")
        if aluno in alunos:
            del alunos[aluno]
            print(f"Aluno {aluno} removido.")
        else:
            print(f"Aluno {aluno} não encontrado.")
    elif escolha == "4":
        aluno = input("Digite o nome do aluno para atualizar a nota: ")
        if aluno in alunos:
            nota = float(input("Digite a nova nota do aluno: "))
            alunos[aluno] = nota
            print(f"Nota de {aluno} atualizada para {nota}.")
        else:
            print(f"Aluno {aluno} não encontrado.")
    elif escolha == "5":
        aluno = input("Digite o nome do aluno para ver a nota: ")
        if aluno in alunos:
            print(f"A nota de {aluno} é {alunos[aluno]}.")
        else:
            print(f"Aluno {aluno} não encontrado.")
    elif escolha == "6":
        if alunos:
            media = sum(alunos.values()) / len(alunos)
            print(f"A média das notas é {media:.2f}.")
        else:
            print("Nenhum aluno cadastrado.")
    elif escolha == "0":
        print("A Sair do programa. Até um dia!")
        break