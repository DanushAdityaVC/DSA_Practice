import java.util.*;
public class vote {
    public static void main(String[]args){
        Scanner ages=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=ages.nextInt();
        if(age>18){
            System.out.println("Eligibile to vote");
        }
        else{
            System.out.println("Not Eligibile to vote");
        }
    }
}
