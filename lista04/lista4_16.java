// Leia um número inteiro representando a temperatura de um servidor (em graus Celsius). Utilizando condicionais encadeadas, 
// classifique o estado do servidor: temperatura >= 90: "Crítico – Desligamento Iminente"; temperatura >= 70: "Alerta – 
// Verificar Refrigeração"; temperatura < 70: "Normal".

package P2_26.lista04;

import java.util.Scanner;

public class lista4_16 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a temperatura do servidor (em Celsius): ");
        int temperatura = entrada.nextInt();

        if (temperatura >= 90) {
            System.out.println("Crítico – Desligamento Iminente");
        } else if (temperatura >= 70) {
            System.out.println("Alerta – Verificar Refrigeração");
        } else {
            System.out.println("Normal");
        }
        entrada.close();
    }  
}
