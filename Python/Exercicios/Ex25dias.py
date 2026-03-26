#Faça um programa que diga os dias vividos até hoje, 2- Verificar fim de semana
from datetime import datetime, date
data_nascimento_str = input("Digite sua data de nascimento (dd/mm/yyyy): ")
data_nascimento = datetime.strptime(data_nascimento_str, "%d/%m/%Y").date()
hoje = date.today()
dias_vividos = (hoje - data_nascimento).days

print(f"Você já viveu {dias_vividos} dias.")

data_input = input("Introduz uma data (DD/MM/AAAA): ")
data = datetime.strptime(data_input, "%d/%m/%Y")
 
if data.weekday() >= 5:
    print("É fim de semana")
else:
    print("É dia de semana")