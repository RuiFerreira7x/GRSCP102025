#data uma lista de datas [12-04-2023, 12-01-2023, 16-12-2024] imprimas as datas que estão entre duas datas pedidas ao utilizador

from datetime import datetime

# Lista de datas
datas_str = ["12-04-2023", "12-01-2023", "16-12-2024"]

# Converte as datas da lista para objetos datetime
datas = [datetime.strptime(d, "%d-%m-%Y") for d in datas_str]

# Pede ao utilizador o intervalo
inicio_str = input("Data de início (dd-mm-aaaa): ")
fim_str = input("Data de fim (dd-mm-aaaa): ")

# Converte as datas inseridas
inicio = datetime.strptime(inicio_str, "%d-%m-%Y")
fim = datetime.strptime(fim_str, "%d-%m-%Y")

print("\nDatas dentro do intervalo:")
for d in datas:
    if inicio <= d <= fim:
        print(d.strftime("%d-%m-%Y"))