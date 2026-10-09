#Crie um programa que leia o número de usuários virtuais de um cliente de um serviço em nuvem e, utilizando if-elif-else / else if, aplique um desconto sobre o valor da mensalidade: mais de 500 usuários: desconto 
# de 20%; mais de 100 usuários: desconto de 10%; caso contrário: sem desconto (0%). Exiba o percentual de desconto aplicado.


usuarios = int(input("Digite o número de usuários virtuais: "))

if usuarios > 500:
    print("Desconto aplicado: 20%")
elif usuarios > 100:
    print("Desconto aplicado: 10%")
else:
    print("Desconto aplicado: 0%")
