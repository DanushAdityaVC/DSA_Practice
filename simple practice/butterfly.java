public class butterfly {
    public static void main(String []args){
        int n=4;
        //upper half
        for(int i=1;i<=n;i++){
            //left side
            //print stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //print spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //right side
            //print spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //print stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //bottom half
        for(int i=n-1;i>=1;i--){
            //left side
            //print stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
             // print space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //right side
            //print spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //print stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
