#Leia a nota final de um aluno e, utilizando o operador ternário, exiba "Aprovado" caso a nota seja maior ou igual a 6.0, ou 
# "Reprovado" caso contrário.

nota_final = float(input("Digite a nota final de um aluno: "))

aprovado_ou_reprovado = "Aprovado" if nota_final >= 6.0 else "Reprovado"

print(f"Situação do aluno: {aprovado_ou_reprovado}")