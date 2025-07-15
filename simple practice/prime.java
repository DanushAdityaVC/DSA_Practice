public class prime {
    public static void main(String []args){
        int num=1;
        boolean is_prime=true;
        if (num==1) is_prime=false;
            for(int i=2;i<=num/2;i++){
                if(num%i==0){
                    is_prime=false;
                    break;
                }
            }
            System.out.println(is_prime? "prime":"not prime");
    }

}
