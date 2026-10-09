//Crie um programa que leia o número de usuários virtuais de um cliente de um serviço em nuvem e, utilizando if-elif-else 
// / else if, aplique um desconto sobre o valor da mensalidade: mais de 500 usuários: desconto de 20%; mais de 100 usuários: 
// desconto de 10%; caso contrário: sem desconto (0%). Exiba o percentual de desconto aplicado.

package P2_26.lista04;

import java.util.Scanner;

public class lista4_14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número de usuários virtuais: ");
        int usuarios = entrada.nextInt();

        if (usuarios > 500) {
            System.out.println("Desconto aplicado: 20%");
        } else if (usuarios > 100) {
            System.out.println("Desconto aplicado: 10%");
        } else {
            System.out.println("Desconto aplicado: 0%");
        }
        entrada.close();
    } 
}
