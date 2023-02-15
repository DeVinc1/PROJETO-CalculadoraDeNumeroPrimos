import java.util.ArrayList;

public class mathClass {
    
    public void calcularPrimo(int num){

        /*
         * Lista dos divisores do número fornecido.
         */
        ArrayList<Integer> divisores = new ArrayList<>();

        /*
         * Exceção do número 0 e 1 não serem primos.
         */
        if(num == 0 || num == 1){
            System.out.println("O número " + num + " não é primo. \n\ta. 0 é dívisivel por todos os números \n\tb. 1 é divisível somente por ele.");
        }
        else{
            /*
             * Lógica para adicionar valores que correspondem com divisores do número fornecido.
             */
            for (int i = 1; i <= num; i++){
                if(num % i == 0){
                    divisores.add(i);
                }
            }

            /*
             * Definir se é primo ou não.
             */
            if(divisores.size() == 2){
                System.out.println("\nO número " + num + " é primo.");
            }else{
                System.out.println("\nO número " + num + " não é primo.");
            }

            /*
             * Printar os divisores.
             */

             System.out.println("Os divisores deste número são: " + divisores.toString());
        }
       
    }
}
