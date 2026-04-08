#Cria uma dicionário com Nome e nota final e vai criando alunos e acrescentando ao ficheiro alunos.txt

with open("alunos.txt", "w", encoding="utf-8") as file:
    while True:
        nome = input("Digite o nome do aluno (ou 'sair' para encerrar): ")
        if nome.lower() == 'sair':
            break
        nota = input("Digite a nota final do aluno: ")
        file.write(f"{nome}: {nota}\n")