//Um script de monitoramento mede o ping de um servidor em milissegundos. Utilizando condicionais encadeadas, 
// classifique a conexão: ping < 40ms: "Excelente"; ping entre 40ms e 120ms: "Aceitável"; ping > 120ms: "Alta Latência".

package P2_26.lista04;

import java.util.Scanner;

public class lista4_12 {
     public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o ping do servidor (em ms): ");
        double ping = entrada.nextDouble();

        if (ping < 40) {
            System.out.println("Excelente");
        } else if (ping <= 120) {
            System.out.println("Aceitável");
        } else {
            System.out.println("Alta Latência");
        }
        entrada.close();
    } 
}
