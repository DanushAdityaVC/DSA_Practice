public class Inverted_RightAligned_Triangle_star {
    public static void main(String[]args){
        int n=4;
        for(int i=n;i>=1;i--){
            // creating space
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");

        }
    }
}
