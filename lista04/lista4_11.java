package P2_26.lista04;

import java.util.Scanner;

public class lista4_11 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o peso da encomenda (em kg): ");
        double peso = entrada.nextDouble();

        if (peso <= 5) {
            System.out.println("Frete: R$ 15,00");
        } else if (peso <= 10) {
            System.out.println("Frete: R$ 25,00");
        } else {
            System.out.println("Frete: R$ 40,00");
        }
        entrada.close();
    }
}
