package P2_26.lista04;

import java.util.Scanner;

public class lista4_09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a nota final de um aluno: ");
        double nota_final = entrada.nextDouble();

        String aprovado_ou_reprovado = nota_final >= 6.0 ? "Aprovado" : "Reprovado";

        System.out.println("Situação do aluno: " + aprovado_ou_reprovado);

        entrada.close();
    }
}