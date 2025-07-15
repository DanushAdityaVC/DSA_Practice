public class rev {
    public static void main(String[] args) {
        int num = 121, temp = num, dig = 0, reve = 0;
        while (temp > 0) {
            dig = temp % 10;
            reve = reve * 10 + dig;
            temp = temp / 10;
        }
        System.out.println(" og:"+num);
        System.out.println("rev:"+reve);
        if (num == reve) {
            System.out.println("palindrome");
        } else {
            System.out.println("Not a palindrome");
        }
    }
}
