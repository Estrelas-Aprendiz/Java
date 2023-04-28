public class For {
    public static void main(String[] args){

        // Exemplo estrutura for
        int escada = 10;
        String nome = "Carol";
        char letraAlfabeto = 'Q';

        for (int i = 1; i <= escada; i++){

            if (i % 2 == 0){
                System.out.println("Quem está subindo a escada é - "+nome);
                System.out.println("Degrau da escada subido atualmente: "+i);

            }else{
                System.out.println("Degrau IMPAR escada!");
            }

            System.out.println("--------------------------------------");
        }

        System.out.println("ACABOU A ESCADA");

        System.out.println("--------------------------------------");


        boolean estaSol = false;

        if (estaSol){
            System.out.println("VOU PARA A PRAIA");

            for(int i = 1; i <= 4; i++){
                System.out.println("Estou nadando!!!");
            }

        }else{
            System.out.println("Vou ficar em casa assistindo Netflix!");
        }


    }
}
