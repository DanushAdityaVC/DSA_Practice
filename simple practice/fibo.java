public class fibo {
    public static void main(String[]args){
        int num=167,fib1=0,fib2=1,fib=0,i;
            System.out.print(fib1+" ");
            System.out.print(fib2+" ");
            if(num>2) {
                for (i = 0; i < num - 2; i++) {
                    fib = fib1 + fib2;
                    fib1 = fib2;
                    fib2 = fib;
                    System.out.print(fib + " ");
                }
            }
    }
}
