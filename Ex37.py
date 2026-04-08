#Dado um ficheiro  chamado temp.txt cada linha tem cidade:temperatura.  Porto;14    Lisboa:19  No main cria um dicionario {cidade: temperatura} e imprime o mesmo

with open("temp.txt", "r", encoding="utf-8") as f:
    print(f.read())
