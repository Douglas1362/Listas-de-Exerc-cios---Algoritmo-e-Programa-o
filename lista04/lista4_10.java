//Leia a idade de uma pessoa e uma informação booleana indicando se ela possui autorização de um responsável. 
// Utilizando condicionais aninhadas (if dentro de if), exiba "Entrada permitida" apenas se a pessoa tiver 18 anos ou mais, 
// ou, sendo menor de idade, possuir a autorização

package P2_26.lista04;

import java.util.Scanner;

public class lista4_10 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a sua idade: ");
        int idade = entrada.nextInt();

        System.out.print("Possui autorização (Sim ou Não): ");
        String autorizacao = entrada.next().toLowerCase();

        if (idade >= 18) {
            System.out.println("Entrada Permitida");
        } else {
            if (autorizacao.equals("sim")) {
                System.out.println("Entrada Permitida");
            } else {
                System.out.println("Entrada Negada");
            }
        }
        entrada.close();
    } 
}
