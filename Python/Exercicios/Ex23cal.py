
import Python.Exercicios.Ex23Calculadora as Ex23Calculadora 

# pede dois números 

num1 = float(input("Digite um numero: ")) 
num2 = float(input("Digite outro numero: ")) 

print(f"\nResultado da soma: {Ex23Calculadora.somar(num1, num2)}")
print(f"Resultado da subtração: {Ex23Calculadora.subtrair(num1, num2)}")
print(f"Resultado da multiplicação: {Ex23Calculadora.multiplicar(num1, num2)}")
print(f"Resultado da divisão: {Ex23Calculadora.dividir(num1, num2)}")
 
# Cria uma lista de números e mostra a sua média
minha_lista = [10, 20, 30, 40, 50]
resultado_media = Ex23Calculadora.media(minha_lista)
 
print(f"\nLista de números: {minha_lista}")
print(f"Média da lista utilizando o módulo: {resultado_media}")