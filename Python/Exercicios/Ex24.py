# Peça ao utilizador uma data em converta para datetime e imprima

from datetime import datetime


data_str = input("Digite uma data (dd/mm/yyyy): ")
data_convertida = datetime.strptime(data_str, "%d/%m/%Y")
print("Data convertida:", data_convertida)