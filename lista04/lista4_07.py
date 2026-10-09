#Construa um roteador simples que leia um código de status HTTP (inteiro). Utilizando switch/match-case, retorne: 200: "OK";
# 404: "Not Found"; 500: "Internal Server Error"; qualquer outro valor: "Código Desconhecido".

codigo_http = int(input("Digite o código de status HTTP: "))

match codigo_http:
    case 200:
        print("Ok")
    case 404:
        print("Not Found")
    case 500:
        print("Internal Server Error")
    case _:
        print("Código Desconhecido")