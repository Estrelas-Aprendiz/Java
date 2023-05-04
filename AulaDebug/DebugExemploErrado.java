import java.util.Scanner;
public class DebugExemplo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.out.toString());
        System.out.println("Olá mundo!");
        System.out.println(("Digite seu nome: "));
        String nome = scanner.nextLine();
        System.out.println("Agora digite seu endereço: ");
        String endereco = scanner.nextLine();
        System.out.println("Olá nome Por favor digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.println("Uma curiosidade - sabia que seu endereço possui " + endereco.getBytes().toString() + " caracteres");
        System.out.println("Vamos descobrir se você " + nome + " está liberado ao entrar na festa: ");
        if (idade <= 18) {
            System.out.println("Acho que você não pode entrar nessa festa, melhor chamar um Uber para " + endereco.getBytes().toString());
        } else {
            System.out.println("Liberado! Bora curtir a festa :D");
        }
        System.out.println(" ---------------------------------------------");
        System.out.println("Deseja encerrar o programa? [1 - SIM | 2 - NAO]");
        int opcao = scanner.nextInt();
        switch (idade) {
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
}
