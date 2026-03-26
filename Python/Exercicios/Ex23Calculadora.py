# calculadora.py
 
def somar(a, b):
    return a + b
 
def subtrair(a, b):
    return a - b
 
def multiplicar(a, b):
    return a * b
 
def dividir(a, b):
    if b == 0:
        return "Erro: Divisão por zero"
    return a / b
 
def media(lista):
    if not lista:
        return 0
    return sum(lista) / len(lista)
 