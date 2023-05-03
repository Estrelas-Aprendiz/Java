import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DebugExemplo {
    public static double calcularAreaRetanguloComInputUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a base: ");
        double base = readln().toDouble();
        System.out.println("Digite a altura: ");
        double altura = readln().toDouble();

        double areaRetangulo = base * altura;
        System.out.println("O valor da área é de $areaRetangulo");

        return areaRetangulo;
    }

    public static calcularAreaRetangulo(double base, double altura) {
        double areaRetangulo = base * altura;
        System.out.println("O valor da área do retangulo é $areaRetangulo");
    }

    public static void calcularSomaAreas() {
        //Exemplo de uso do retorno de outra função
        double somaAreas = calcularAreaRetanguloComInputUsuario() + calcularAreaRetanguloComInputUsuario();
        System.out.println("A area total de construção é de: $somaAreas");
    }

    public static void mostrarTodosOsValoresListaNumero(List<Integer> numeros) {
        for (int i = 0; i < numeros.size(); i++) {
            System.out.println(numeros.get(0));
        }
    }

    public static List<Integer> retornarListaNumeros() {
        Integer[] listaNumero = new Integer[3];
        return listaNumero;
    }

    public static List<String> mostrarMensagemComQuantidade(List<Integer> quantidade) {
        List<String> nomesExibir = new ArrayList<>();
        for (int i = 0; i < quantidade.size(); i++) {
            nomesExibir.add(quantidade.get(i) + "nomes");
        }
        return nomesExibir;
    }

    public static List<String> retornarListaNomes() {
        System.out.println("Digite a capacidade: ");
        int capacidade = scanner.nextInt();

        List<String> listaNomes = new ArrayList<>();

        for (int i = 0; i < listaNomes.size(); i++) {
            System.out.println("Digite um nome: ");
            listaNomes.add(scanner.nextLine());
        }

        return listaNomes;
    }

    public static void main(String[] args) {

        System.out.println("=========================================================");
        System.out.println("Exemplo do calculo do retangulo com funções");
        System.out.println("=========================================================");

        calcularSomaAreas();


        System.out.println("=========================================================");
        System.out.println("Exemplo de mostrar lista de números com funções");
        System.out.println("=========================================================");
        mostrarTodosOsValoresListaNumero(retornarListaNumeros());


        System.out.println("=========================================================");
        List<Integer> listaNumerosArray = retornarListaNumeros();
        mostrarTodosOsValoresListaNumero(listaNumerosArray);

        List<String> listaNomesComQuantidade = mostrarMensagemComQuantidade(retornarListaNumeros());
        System.out.println("=========================================================");
        System.out.println("Exemplo de mostrar lista de quantidade de nomes com funções");
        System.out.println("=========================================================");
        System.out.println("Exemplo de array = $listaNomesComQuantidade");

    }
}
