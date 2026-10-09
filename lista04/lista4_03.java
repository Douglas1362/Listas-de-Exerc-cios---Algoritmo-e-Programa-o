//Leia um nome de usuário e uma senha (ambos como texto). Utilizando if-else, exiba 
// "Acesso permitido" caso o usuário seja igual a "admin" e a senha seja igual a "1234", 
// ou "Acesso negado" caso contrário.

package P2_26.lista04;

import java.util.Scanner;

public class lista4_03 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Usuário: ");
        String usuario = entrada.nextLine();

        System.out.print("Digite a sua senha: ");
        String senha = entrada.nextLine();

        if (usuario.equals("admin") && senha.equals("1234")) {
            System.out.println("Acesso permitido");
        } else {
            System.out.println("Acesso negado");
        }

        entrada.close();
    }
}
