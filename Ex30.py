import re
#validar a data enquanto a data for invalida volta a pedir uma data ao utilizador no formato dd/mm/yyyy
padrao = r'^\d{2}/\d{2}/\d{4}$'

while True:
    data = input("Introduza uma data válida (dd/mm/yyyy): ")

    if re.match(padrao, data):
        print("Data válida!")
        break
    else:
        print("Data inválida. Tente novamente.")