import java.util.Scanner;
class if_else{
    public static void main(String[]args){
        Scanner marks=new Scanner(System.in);
        System.out.println("Enter the mark:");
        int mark=marks.nextInt();
        if(mark>=35){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
    }

}