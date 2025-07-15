public class pattern {
    public static void main(String []args){
        int row=8,col=1;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("*");
            }
            System.out.println("");
            col++;
        }
        for(int m=row;m>0;m--){
            for(int n=col;n>1;n--){
                System.out.print("*");
            }
            System.out.println("");
            col--;
        }
    }
}
