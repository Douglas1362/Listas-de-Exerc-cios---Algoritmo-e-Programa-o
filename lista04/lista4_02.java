//Leia um número inteiro digitado pelo usuário e, utilizando if-else, exiba se o número é par ou ímpar

package P2_26.lista04;

import java.util.Scanner;

public class lista4_02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.print("Seu número e par");
        } else {
            System.out.println("Seu número e impar");
        }
        entrada.close();
    }
}
