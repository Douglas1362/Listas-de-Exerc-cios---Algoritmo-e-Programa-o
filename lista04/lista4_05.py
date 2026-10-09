#Escreva um script que leia o Índice de Massa Corporal (IMC) de uma pessoa e, utilizando condicionais encadeadas, classifique-o em: IMC < 18.5: "Abaixo do peso"; 
# IMC entre 18.5 e 24.9: "Peso normal"; IMC entre 25.0 e 29.9: "Sobrepeso"; IMC >= 30.0:  "Obesidade".

imc = float(input("Digite o seu IMC: "))

if imc < 18.5:
    print("Abaixo do peso")
elif imc <= 24.9:
    print("Peso normal")
elif imc <= 29.9:
    print("Sobrepeso")
else:
    print("Obesidade")