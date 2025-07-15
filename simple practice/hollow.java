public class hollow {
    public static void main(String[]args){
        int n=5;
        for(int i=1;i<=n;i++){
            if(i==5 || i==1){
                for(int j=1;j<=n;j++){
                    System.out.print("*");
                }
            }
            else {
                System.out.print("*");
                for(int j=1;j<=3;j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.print("\n");

        }
    }
}
