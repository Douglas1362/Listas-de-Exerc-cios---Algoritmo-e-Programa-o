#Leia um número inteiro de 1 a 7 representando o dia da semana e, utilizando switch/match-case, exiba o nome correspondente 
# do dia (1 = "Domingo", 2 = "Segunda-feira", e assim por diante). Para qualquer valor fora do intervalo, exiba "Dia inválido".

numero = int(input("Digite um número inteiro de 1 a 7 representando o dia da semana: "))

match numero:
    case 1:
        print("Domingo")
    case 2:
        print("Segunda-feira")
    case 3:
        print("Terça-feira")
    case 4:
        print("Quarta-feira")
    case 5:
        print("Quinta-feira")
    case 6:
        print("Sexta-feira")
    case 7:
        print("Sábado")
    case _:
        print("Dia inválido")