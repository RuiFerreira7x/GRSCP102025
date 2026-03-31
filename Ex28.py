import re
#pedir numero ao utilizador e verificar se é um numero portugues enquanto o numero for invalido volta a pedir um numero ao utilizador

numero = input("Digite um número de telefone: ")

    # Expressão regular para validar números portugueses
padrao = r'^(9[1236]\d{7}|2\d{8})$'
    

while True:
    if  re.match(padrao, numero):
        print("Número válido.")    
    break    
else:    
    print("Número inválido. Por favor, digite um número de telefone português válido.")
    numero = input("Digite um número de telefone: ")   