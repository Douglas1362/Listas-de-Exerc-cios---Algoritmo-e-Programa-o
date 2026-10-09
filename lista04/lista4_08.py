#Leia um número inteiro e, utilizando o operador ternário, exiba "Par" ou "Ímpar" em uma única linha, sem usar if tradicional.

numero = int(input("Digite um número inteiro: "))

impar_ou_par = "Par" if numero % 2 == 0 else "Ímpar"

print(f"Seu numero é: {impar_ou_par}")