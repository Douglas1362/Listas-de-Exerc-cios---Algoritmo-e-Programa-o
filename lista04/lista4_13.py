#Crie um programa que leia o cargo de um usuário (texto: "admin", "dev" ou "guest") e, utilizando switch/match-case, libere o nível de acesso correspondente: 
# "admin": "Acesso Total"; "dev": "Acesso ao Código-Fonte"; "guest": "Acesso Somente Leitura"; qualquer outro valor: "Cargo Inválido".

usuario = input("Digite seu cargo (admin, dev ou guest): ").lower()

match usuario:
    case "admin":
        print("Acesso Total")
    case "dev":
        print("Acesso ao Código-Fonte")
    case "guest":
        print("Acesso Somente Leitura")
    case _:
        print("Cargo Inválido")