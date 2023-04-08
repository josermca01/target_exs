package target_ex5;

import java.util.Scanner;

public class run {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        inverte num = new inverte();
        System.out.println("Digite uma palavra a ser invertida");
        String invertida = num.fib(scanner.nextLine());
        System.out.println("A palavra invertida fica "+ invertida);           
    }
}
