import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExemploListas {
    public static void main(String[] args) {
        List<Integer> notas = new ArrayList<>();

        List<Float> numeros = new ArrayList<>();

        List<String> nomes = new ArrayList<>();

        //Exemplo de eadição por valor
        nomes.add("Jessica");
        nomes.add("Carol");

        //Exemplo de adição por index e valor
        nomes.add(2, "Laura");
        nomes.add(3, "Paula");
        nomes.add(4, "Milena");
        nomes.add(5, "Laura");


        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("Posição: " + i + " - Nome - " + nomes.get(i));
        }

        //Exemplo de remoção por index
        //nomes.remove(3);

        //Exemplo de remoção por valor
        nomes.remove("Laura");

        System.out.println("---------------- ATUALIZADA ------------------------");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("Posição: " + i + " - Nome - " + nomes.get(i));
        }

        System.out.println("---------------- ------------------------");
        System.out.println("LAST INDEX - " + nomes.lastIndexOf("Carol"));

        System.out.println("---------------- LISTA COM LISTA DE ALUNOS ------------------------");

        List<String> alunos = new ArrayList<>();

        alunos.add("Amamda");
        alunos.add("Lalesca");
        alunos.add("Raissa");

        nomes.addAll(alunos);

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println("Posição: " + i + " - Nome - " + nomes.get(i));
        }

        System.out.println("---------------- LISTA COM LISTA DE ALUNOS e CHAMADA ------------------------");


        Scanner valorDigitado = new Scanner(System.in);
        int qtdAlunos;

        System.out.println("Digite a quantidade de alunos que você quer adicionar: ");
        qtdAlunos = valorDigitado.nextInt();

        for (int i = 0; i < qtdAlunos; i++) {

            System.out.println("Digite o nome da aluna: ");
            alunos.add(valorDigitado.next());
        }

        System.out.println("----------- LISTA DE CHAMADA ------------");

        for (int i = 0; i < alunos.size(); i++) {
            System.out.println("posição " + i + " - " + alunos.get(i));
        }

        System.out.println("FIM DA AULA!");

    }

}

