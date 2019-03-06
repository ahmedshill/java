import java.util.Scanner;

public class capture {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {


            System.out.println("enter first number :");
            int x = s.nextInt();
            if (x==222)
                break;
            System.out.println("enter the second number:");
            double y = s.nextDouble();

            double result = x * y;
            System.out.println("result is " + result);


        }
    }
}
