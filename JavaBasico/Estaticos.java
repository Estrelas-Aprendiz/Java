public class Estaticos {

    public static void main(String[] args) {
        SalaDeAula.professor = "Jess";
        SalaDeAula.ensinar();

//        SalaDeAula a1 = new SalaDeAula();
        SalaDeAula.aluno = "Maria";
        System.out.println(SalaDeAula.aluno);

//        System.out.println(a1.professor);

        SalaDeAula a2 = new SalaDeAula();
        a2.aluno = "Joana";

        System.out.println(SalaDeAula.professor);

        System.out.println(a2.professor);
        System.out.println(a2.aluno);

    }
}
