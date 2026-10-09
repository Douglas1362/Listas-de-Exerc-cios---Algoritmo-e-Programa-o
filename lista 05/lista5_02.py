# Leia um número inteiro N e calcule a soma de todos os inteiros de 1 até N, 
# utilizando um laço while. 

numero = int(input("Digite um numero interiro: "))

soma = 0
contador = 0


while contador < numero:

    contador+= 1

    soma+= contador

print(soma)