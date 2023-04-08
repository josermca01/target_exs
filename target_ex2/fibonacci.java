package target_ex2;

public class fibonacci {
    public boolean fib(Integer num){
        Integer numfib1 = 0;
        Integer numfib = 1;
        Integer aux = 1;
        boolean resp=false;
        while(num > numfib){
            aux = numfib;
            numfib += numfib1;
            numfib1 = aux;
            if(num==numfib){
                resp = true;
            }
        }

        return resp ;
    }
}
