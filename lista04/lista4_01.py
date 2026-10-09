#Escreva um script que leia a porcentagem de uso de memória de um servidor. 
# Se a porcentagem ultrapassar 85.0%, o sistema deve exibir "Alerta de Memória". 
# Utilize um condicional simples (if), sem bloco alternativo.

memoria = float(input("Digite a porgentagem de memória usada: "))

if memoria >= 85.0:
    print("Alerta de Memória")