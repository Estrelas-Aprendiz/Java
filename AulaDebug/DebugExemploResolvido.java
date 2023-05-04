import java.util.Scanner;

public class DebugExemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá mundo!");
        System.out.println(("Digite seu nome: "));
        String nome = scanner.nextLine();

        System.out.println("Agora digite seu endereço: ");
        String endereco = scanner.nextLine();

        System.out.println("Olá " + nome + " Por favor digite sua idade: ");
        //exemplo de conversão de dado de um tipo String para o tipo Int usado o readln().toInt()
        int idade = scanner.nextInt();


        //exemplo de safe-call em uma variavel nullable usando o operador ?
        System.out.println("Uma curiosidade - sabia que seu endereço possui " +endereco.length() + " caracteres");
        System.out.println("Vamos descobrir se você " + nome +  " está liberado ao entrar na festa: ");

        //Exemplo de condicional if else
        if (idade <= 18) {
            System.out.println("Acho que você não pode entrar nessa festa, melhor chamar um Uber para " +endereco.length());
        } else {
            System.out.println("Liberado! Bora curtir a festa :D");
        }

        System.out.println(" ---------------------------------------------" );
        System.out.println("Deseja encerrar o programa? [1 - SIM | 2 - NAO]");
        int opcao = scanner.nextInt();

        //Exemplo de condicional when
        switch (opcao) {
            case 1:
                System.exit(0);
                break;
            case 2:
                System.out.println("Podemos continuar outra hora o que acha?");
                break;
            default: {
                System.out.println("Opção inválida!");
            }
        }
    }
}
