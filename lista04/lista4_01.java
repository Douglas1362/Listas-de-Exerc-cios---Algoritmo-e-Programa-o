//Escreva um script que leia a porcentagem de uso de memória de um servidor. 
// Se a porcentagem ultrapassar 85.0%, o sistema deve exibir "Alerta de Memória". 
// Utilize um condicional simples (if), sem bloco alternativo.

package P2_26.lista04;

import java.util.Scanner;

public class lista4_01 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
    
        System.out.print("Digite a porgentagem de memória usada: ");
        double memoria = entrada.nextDouble();

        if (memoria >= 85.00) {
            System.out.print("Alerta de Memória");
        } 
        entrada.close();
    }
}
