//Construa um roteador simples que leia um código de status HTTP (inteiro). Utilizando switch/match-case, retorne: 200: "OK"; 404: 
// "Not Found"; 500: "Internal Server Error"; qualquer outro valor: "Código Desconhecido".

package P2_26.lista04;

import java.util.Scanner;


public class lista4_07 {
     public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

                System.out.print("Digite o código de status HTTP: ");
        int codigo_http = entrada.nextInt();

        switch (codigo_http) {
            case 200:
                System.out.println("Ok");
                break;

            case 404:
                System.out.println("Not Found");
                break;

            case 500:
                System.out.println("Internal Server Error");
                break;

            default:
                System.out.println("Código Desconhecido");
        }
        entrada.close();
    }
}