#Um script de monitoramento mede o ping de um servidor em milissegundos. Utilizando condicionais encadeadas, 
# classifique a conexão: ping < 40ms: "Excelente"; ping entre 40ms e 120ms: "Aceitável"; ping > 120ms: "Alta Latência".


ping = float(input("Digite o ping do servidor (em ms): "))

if ping < 40:
    print("Excelente")
elif ping <= 120:
    print("Aceitável")
else:
    print("Alta Latência")
