//Utilizando um laço for, conte e exiba quantos números pares existem no intervalo de 
// 1 a 100. 

import java.util.Scanner;

public class lista5_04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int contador = 1;

        while (contador < 101) {

            if (contador % 2 == 0){

            System.err.println(contador);

            }
        
        contador++;
        }
        entrada.close();
    }
}