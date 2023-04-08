package target_ex5;

public class inverte {
    public String fib(String palavra) {
        String invertida = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            invertida += palavra.charAt(i);
        }
        return invertida;
    }
}
