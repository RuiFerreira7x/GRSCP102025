
import Calculadora 

# pede dois números 

num1 = float(input("Digite um numero: ")) 
num2 = float(input("Digite outro numero: ")) 

print(f"\nResultado da soma: {Calculadora.somar(num1, num2)}")
print(f"Resultado da subtração: {Calculadora.subtrair(num1, num2)}")
print(f"Resultado da multiplicação: {Calculadora.multiplicar(num1, num2)}")
print(f"Resultado da divisão: {Calculadora.dividir(num1, num2)}")
 
# Cria uma lista de números e mostra a sua média
minha_lista = [10, 20, 30, 40, 50]
resultado_media = Calculadora.media(minha_lista)
 
print(f"\nLista de números: {minha_lista}")
print(f"Média da lista utilizando o módulo: {resultado_media}")