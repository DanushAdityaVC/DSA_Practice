public class triangle_0_1 {
    public static void main(String []args){
        int n=5;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                boolean num=false;
                for (int j=1;j<=i;j++){
                    System.out.print(num? 1:0);
                    num=!num;
                }
            }
            else {
                boolean val=false;
                for (int j=1;j<=i;j++){
                    System.out.print(val? 1:0);
                    val=!val;
                }
            }
            System.out.println();
        }
    }
}
