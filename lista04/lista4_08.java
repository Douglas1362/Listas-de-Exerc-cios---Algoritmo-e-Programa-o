//Leia um número inteiro e, utilizando o operador ternário, exiba "Par" ou "Ímpar" em uma única linha, sem usar if tradicional.

package P2_26.lista04;

import java.util.Scanner;

public class lista4_08 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        String impar_ou_par = numero % 2 == 0 ? "Impar": "Par";

        System.err.println("Seu numero é: " + impar_ou_par);

        entrada.close();
    }
}