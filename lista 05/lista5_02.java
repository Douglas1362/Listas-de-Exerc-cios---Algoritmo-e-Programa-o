// Leia um número inteiro N e calcule a soma de todos os inteiros de 1 até N, 
// utilizando um laço while. 

import java.util.Scanner;

public class lista5_02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();
        
        int soma = 0;
        int contador = 0;

        while (contador < numero) {

            contador+= 1;
            soma+= contador;
        }
        System.out.print(soma);
        
        entrada.close();
    }
}