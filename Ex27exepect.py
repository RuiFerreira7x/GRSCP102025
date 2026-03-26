def inputcheck():
    try:
      num=int(input("Digite um número: "))
    except ValueError:
        raise
    
try:
    inputcheck()
except ValueError:
    print("Erro tratado no nível superior.")