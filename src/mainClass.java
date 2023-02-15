import java.util.Scanner;

public class mainClass {
    public static void main(String[] args) throws Exception {

        /*
         * Instância de classes
         */
        mathClass matematica = new mathClass();
        Scanner input = new Scanner(System.in);
        
        /*
         * Cabeçalho
         */
        System.out.println("---------------------------------------------");
        System.out.println("|       CALCULADORA DE NÚMEROS PRIMOS       |");
        System.out.println("---------------------------------------------");
        System.out.print("\nDigite um número e saiba se ele primo ou não bem como seu divisor: ");
        int num = 0;

        /*
         * Try & Catch da exceção de tipo de input incorreto.
         */
        try {
            num = input.nextInt();
        } catch (Exception e) {
            System.out.println("É possível realizar o cálculo de números primos somente com números naturais.");
        }

        /*
         * Exceção de número negativo.
         */
        if(num <= 0){
            System.out.println("É possível realizar o cálculo de números primos somente com números naturais.");
            System.exit(0);
        }

    }
}
