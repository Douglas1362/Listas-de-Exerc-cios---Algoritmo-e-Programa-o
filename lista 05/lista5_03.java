// Leia um número inteiro e exiba sua tabuada completa (de 1 a 10), utilizando um 
// laço for

import java.util.Scanner;

public class lista5_03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();
        
        int contador = 1;

        while (contador < 11) {

            int soma = contador * numero;

            System.err.println(contador + "x" + numero + "=" + soma);

            contador++;
            
        }
        entrada.close();
    }
}