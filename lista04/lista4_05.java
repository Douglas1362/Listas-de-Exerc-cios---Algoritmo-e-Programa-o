//Escreva um script que leia o Índice de Massa Corporal (IMC) de uma pessoa e, utilizando condicionais encadeadas, 
// classifique-o em: IMC < 18.5: "Abaixo do peso"; IMC entre 18.5 e 24.9: "Peso normal"; IMC entre 25.0 e 29.9: 
// "Sobrepeso"; IMC >= 30.0: "Obesidade".

package P2_26.lista04;

import java.util.Scanner;

public class lista4_05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o seu IMC: ");
        double imc = entrada.nextDouble();

        if(imc <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if(imc <= 24.9) {
            System.out.println("Peso normal");
        } else if(imc <= 29.9){
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }
        entrada.close();
    }
}