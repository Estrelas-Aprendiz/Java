import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {

        // Exemplo declaração e uso simples de vetores
        String[] alunos = new String[5];

        alunos[0] = "Ana Flavia";
        alunos[1] = "Amanda Souza";
        alunos[2] = "Vitoria Caroline";
        alunos[3] = "Myllena Oliveira";
        alunos[4] = "Laura Xavier";

        for(int i = 0; i < alunos.length; i++){
            System.out.println("A aluna na posição "+ i + " é - "+alunos[i]);
        }

        //----------------------------------------------------------------
        // Exemplo declaração e uso de vetores

        Scanner valorDigitado = new Scanner(System.in);
        int qtdAlunos;

        System.out.println("Digite a quantidade de alunos que você quer adicionar: ");
        qtdAlunos = valorDigitado.nextInt();
        String[] alunas = new String[qtdAlunos];

        for (int i = 0; i < qtdAlunos; i++){

            System.out.println("Digite o nome da aluna: ");
            alunas[i] = valorDigitado.next();
        }

        System.out.println("----------- LISTA DE CHAMADA ------------");

        for (int i = 0; i < alunos.length; i++){
            alunas[2] = null;
            System.out.println("posição "+ i+ " - " +alunas[i]);
        }

        System.out.println("FIM DA AULA!");
    }
}
