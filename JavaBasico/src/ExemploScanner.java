import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {

        // Exemplo declaração e uso do Scaner
        Scanner valorDigitadoPeloUsuario = new Scanner(System.in);
        String nomeUsuario = "Carol";
        int idadeUsuario;

        System.out.println("Digite seu nome: ");
        nomeUsuario = valorDigitadoPeloUsuario.next();

        System.out.println("Digite sua idade: ");
        idadeUsuario = valorDigitadoPeloUsuario.nextInt();

        System.out.println("O nome digitado foi: "+ nomeUsuario + "e sua idade é: "+ idadeUsuario);
    }
}
