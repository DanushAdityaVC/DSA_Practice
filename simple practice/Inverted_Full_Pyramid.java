public class Inverted_Full_Pyramid {
    public static void main(String []args){
        int n=4;
        for(int i=n;i>=0;i--){
            //create spaces
            for(int j=0;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=2*i+1;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
