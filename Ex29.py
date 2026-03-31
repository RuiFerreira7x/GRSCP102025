import re
# validar um email enquanto o email for invalido volta a pedir um email ao utilizador com .com ou .pt
email = input("Digite um email: ")
def validar_email(email):
    # Expressão regular para validar emails com .com ou .pt
    padrao = r'^[\w\.-]+@[\w\.-]+\.(com|pt)$'
    
    if re.match(padrao, email):
        return True
    else:
        return False