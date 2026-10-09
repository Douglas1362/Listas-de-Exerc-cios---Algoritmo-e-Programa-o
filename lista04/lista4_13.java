//Crie um programa que leia o cargo de um usuário (texto: "admin", "dev" ou "guest") e, utilizando switch/match-case, 
// libere o nível de acesso correspondente: "admin": "Acesso Total"; "dev": "Acesso ao Código-Fonte"; "guest": 
// "Acesso Somente Leitura"; qualquer outro valor: "Cargo Inválido".


package P2_26.lista04;

import java.util.Scanner;

public class lista4_13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu cargo (admin, dev ou guest): ");
        String cargo = entrada.next().toLowerCase();

        switch (cargo) {
            case "admin":
                System.out.println("Acesso Total");
                break;
            case "dev":
                System.out.println("Acesso ao Código-Fonte");
                break;
            case "guest":
                System.out.println("Acesso Somente Leitura");
                break;
            default:
                System.out.println("Cargo Inválido");
                break;
        }
        entrada.close();
    }
}