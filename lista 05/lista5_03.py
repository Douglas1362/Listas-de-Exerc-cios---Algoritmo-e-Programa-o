# Leia um número inteiro e exiba sua tabuada completa (de 1 a 10), utilizando um laço 
# for

numero = int(input("Digite um numero inteiro: "))

contador = 1

while contador < 11:
    
    tabuada = contador * numero

    print(f"{contador} x {numero} = {tabuada}")

    contador+= 1