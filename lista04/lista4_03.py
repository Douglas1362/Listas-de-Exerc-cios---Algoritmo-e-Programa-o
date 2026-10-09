#Leia um nome de usuário e uma senha (ambos como texto). Utilizando if-else, exiba "Acesso permitido" 
# caso o usuário seja igual a "admin" e a senha seja igual a "1234", ou "Acesso negado" caso contrário.

usario = input("Usuário: ")
senha = input("Digite a sua senha: ")

if usario == "admin" and senha == "1234":
    print("Acesso permitido")
else:
    print("Acesso negado")