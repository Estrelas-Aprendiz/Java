import java.util.Scanner;

public class ExemploSwitchCase {
    public static void main(String[] args) {

        Scanner valorDigitado = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número: ");
        numero = valorDigitado.nextInt();

        switch (numero){
            case 1:{
                System.out.println("O número digitado é IMPAR!");
                break;
            }
            case 2: {
                System.out.println("O número digitado é PAR!");
                break;
            }
            case 10: {
                System.out.println("O número é camisa 10!");
                break;
            }
            default:{
                System.out.println("Tipo não identificado");
            }
        }
    }
}
