# Leia a idade de uma pessoa e uma informação booleana indicando se ela possui autorização de um responsável. Utilizando 
#condicionais aninhadas (if dentro de if), exiba "Entrada permitida" apenas se a pessoa tiver 18 anos ou mais, ou, sendo menor 
#de idade, possuir a autorização.

idade = int(input("Digite a sua idade: "))

atorizacao = (input("Possui altorização (Sim ou Não): ")).lower()

if idade >=18:
    print("Entrada Permitida")
else:
    if atorizacao == "sim":
        print("Entrada Permitida")
    else:
        print("Entrada Negada")