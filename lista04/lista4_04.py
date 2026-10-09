#Leia a nota final de um aluno (0 a 10) e, utilizando condicionais encadeadas (if-elif-else / else if), 
# classifique-a da seguinte forma: nota >= 9: "A"; nota >= 7: "B"; nota >= 5: "C"; caso contrário: "D".

nota_final = float(input("Digite a nota final do Aluno: "))

if nota_final >= 9:
    print("Nota A")
elif nota_final >= 7:
    print("Nota B")
elif nota_final >= 5:
    print("Nota C")
else:
    print("Nota D")
    
    