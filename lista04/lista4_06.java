//Leia um número inteiro de 1 a 7 representando o dia da semana e, utilizando switch/match-case, exiba o nome correspondente do 
// dia (1 = "Domingo", 2 = "Segunda-feira", e assim por diante). Para qualquer valor fora do intervalo, exiba "Dia inválido".

package P2_26.lista04;

import java.util.Scanner;

public class lista4_06 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro de 1 a 7 representando o dia da semana: ");
        int numero = entrada.nextInt();

        switch (numero) {
            case 1:
            System.out.println("Domingo");
            break;

            case 2:
            System.out.println("Segunda-feira");
            break;

            case 3:
            System.out.println("Terça-feira");
            break;

            case 4:
            System.out.println("Quarta-feira");
            break;

            case 5:
            System.out.println("Quinta-feira");
            break;

            case 6:
            System.out.println("Sexta-feira");
            break;

            case 7:
            System.out.println("Sábado");
            break;

            default:
            System.out.println("Número inválido");
            break;

        }
        entrada.close();
    }
}