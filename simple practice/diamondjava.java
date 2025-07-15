public class diamondjava {
    public static void main(String []args){
        int n=4;
        //upper half
        for(int i=1;i<=n;i++){
            //create spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //print stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=i-1;j++){
                System.out.print("*");
            }

            System.out.println();
        }
        //bottom half
        for(int i=n-1;i>=1;i--){
            //create spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
