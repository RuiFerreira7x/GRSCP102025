#Cria um ficheiro porto.txt com 5 nomes um nome por cada linha e imprime no teu main python
nomes = ["Ricardo Carvalho", "Diogo Costa", "Falcao", "Deco", "Raul Meireles"]

with open("porto.txt", "w", encoding="utf-8") as f:
    for nome in nomes:
        f.write(f"{nome}\n")

print("Nomes escritos no ficheiro 'porto.txt':")
with open("porto.txt", "r", encoding="utf-8") as f:
    for line in f:
        print(line.strip())

