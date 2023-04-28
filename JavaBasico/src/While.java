public class While {
    public static void main(String[] args){

        // Exemplo estrutura while
        int escada = 10;
        int i = 1;

        while(i <= escada){
            System.out.println("O degrau atual é: "+ i);

            if (i % 2 == 0){
                System.out.println("Quem está subindo a escada é Carol");
                System.out.println("Degrau da escada subido atualmente: "+i);

            }else{
                System.out.println("Degrau IMPAR escada!");
            }

            i++;
        }

        System.out.println("O valor do i: "+i);

    }
}
