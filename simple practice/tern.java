import java.util.Scanner;
public class tern {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a=scan.nextInt();
        int b=scan.nextInt();
        System.out.println("result");
        System.out.println(a>b? a:b);
    }
}
