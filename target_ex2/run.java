package target_ex2;

import java.util.Scanner;

public class run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        fibonacci num = new fibonacci();
        System.out.println("Digite um numero ");
        if( num.fib(scanner.nextInt()))
        System.out.println("Numero pertence a sequencia");
        else
        System.out.println("Não pertence");   
        clearBuffer(scanner);             
    }
    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }
}
