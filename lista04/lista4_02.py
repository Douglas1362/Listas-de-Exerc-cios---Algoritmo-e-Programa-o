#Leia um número inteiro digitado pelo usuário e, utilizando if-else, exiba se o número é par ou ímpar.

numero = int(input("Digite um número inteiro: "))

if numero % 2 == 0:
    print("Seu número e par")
else:
    print("Seu número e impar")