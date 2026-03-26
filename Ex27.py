#Peça ao utilizador uma idade.se a idade for negativa ou maior que 120, levante uma exeção personalizada
class IdadeInvalidaError(Exception):
    """Exceção lançada quando a idade não está entre 0 e 120."""
    pass

try:
    idade = int(input("Digite a sua idade: "))

    if idade < 0 or idade > 120:
        raise IdadeInvalidaError("Idade inválida! Deve estar entre 0 e 120.")

    print(f"Idade válida: {idade}")

except IdadeInvalidaError as e:
    print("Erro:", e)

except ValueError:
    print("Erro: deve digitar um número inteiro.")
