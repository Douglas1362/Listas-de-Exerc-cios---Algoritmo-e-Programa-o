//Leia a nota final de um aluno (0 a 10) e, utilizando condicionais encadeadas 
// (if-elif-else / else if), classifique-a da seguinte forma: 
// nota >= 9: "A"; nota >= 7: "B"; nota >= 5: "C"; caso contrário: "D".

package P2_26.lista04;

import java.util.Scanner;

public class lista4_04 {
     public static void main(String[] args) {

         Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a nota final do Aluno: ");
        int nota_final = entrada.nextInt();

        if (nota_final >= 9) {
            System.out.print("Nota A");
        } else if (nota_final  >= 7){
            System.out.print("Nota B");
        } else if (nota_final >= 5) {
            System.out.print("Nota C");
        } else {
            System.out.print("Nota D");
        }
        entrada.close();
    }
}