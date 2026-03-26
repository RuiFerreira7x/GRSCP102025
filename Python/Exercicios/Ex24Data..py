from datetime import datetime, date, timedelta


agora = datetime.now()
print("Agora:", agora)

hoje = date.today()
print("Hoje:", hoje)



d = date(2025, 3, 15)
print("Data:", d)



dt = datetime(2025, 3, 15, 14, 30)
print("Datetime:", dt)

print("Ano:", dt.year)
print("Mês:", dt.month)
print("Dia:", dt.day)
print("Hora:", dt.hour)
print("Minuto:", dt.minute)


formatado = dt.strftime("%d/%m/%Y %H:%M:%S")
print("Formatado:", formatado)


print("Dia da semana:", dt.strftime("%A"))
print("Mês:", dt.strftime("%B"))


data_str = "25/12/2025 18:30"
data_convertida = datetime.strptime(data_str, "%d/%m/%Y %H:%M")
print("Convertida:", data_convertida)

hoje = datetime.now()

amanha = hoje + timedelta(days=1)
print("Amanhã:", amanha)

ontem = hoje - timedelta(days=1)
print("Ontem:", ontem)

data1 = datetime(2025, 1, 1)
data2 = datetime(2025, 3, 1)
diferenca = data2 - data1
print("Diferença em dias:", diferenca.days)

if data2 > data1:
    print("data2 é mais recente que data1")