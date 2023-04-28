public class DoWhile {
    public static void main(String[] args){

        // Exemplo estrutura do while
        int i = 10;
        do{
           System.out.println("Degrau da escada: "+i);

            if (i % 2 == 0){
                System.out.println("Quem está subindo a escada é Carol");
                System.out.println("Degrau da escada subido atualmente: "+i);

            }else{
                System.out.println("Degrau IMPAR escada!");
            }

           i--;
        }while(i>=1);
    }
}
