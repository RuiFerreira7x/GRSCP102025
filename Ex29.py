import re
# validar um email enquanto o email for invalido volta a pedir um email ao utilizador com .com ou .pt
padrao = r"^[\w\.-]+@[\w\.-]+\.(com|pt)$"

while True:
    email = input("Introduza um email válido (.com ou .pt): ")

    if re.match(padrao, email):
        print("Email válido!")
        break
    else:
        print("Email inválido. Tente novamente.")
