# Escreva um script que leia o peso de uma encomenda (em kg) e, utilizando condicionais encadeadas, calcule o valor do 
# frete: até 5kg: R$ 15,00; de 5kg (exclusive) até 10kg: R$ 25,00; acima de 10kg: R$ 40,00. 

peso = float(input("Digite o peso da encomenda (em kg): "))

if peso <= 5:
    print("Frete: R$ 15,00")
elif peso <= 10:
    print("Frete: R$ R$ 25,00")
else:
    print("Frete: R$ R$ R$ 40,00")