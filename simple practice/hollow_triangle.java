public class hollow_triangle {
    public static void main(String[]args){
        int n=5;
        for(int i=1;i<=n;i++){
            if(i==1 || i==n) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
            }
            else {
                    System.out.print("*");
                    for(int j=1;j<=i-2;j++){
                        System.out.print(" ");
                    }
                    System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
