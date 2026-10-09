#Leia um número inteiro representando a temperatura de um servidor (em graus Celsius). Utilizando condicionais encadeadas, 
# classifique o estado do servidor: temperatura >= 90: "Crítico – Desligamento Iminente"; temperatura >= 70: "Alerta – 
# Verificar Refrigeração"; temperatura < 70: "Normal".


temperatura = int(input("Digite a temperatura do servidor (em °C): "))

if temperatura >= 90:
    print("Crítico – Desligamento Iminente")
elif temperatura >= 70:
    print("Alerta – Verificar Refrigeração")
else:
    print("Normal")
