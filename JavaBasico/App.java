public class App {
    public static void main(String[] args) {
        int resultadoDoPrimeiroMetodo =  primeiraSoma(4);
        int resultadoDaSomaMetodo = segundaSoma(resultadoDoPrimeiroMetodo, 7);
        System.out.println(resultadoDaSomaMetodo);
    }
    public static int primeiraSoma(int numero) {
        int resultado = numero + 2;
        return resultado;
    }

    public static int segundaSoma(int numeroDoRsultado, int numeroAleatorio) {
        int soma = numeroDoRsultado + numeroAleatorio;
        return soma;
    }

}
