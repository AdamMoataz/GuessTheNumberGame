
import java.util.Scanner;

public class Mathquiz {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter num 1");
        int num1 = scanner.nextInt();

        System.out.println("Please enter num 2");
        int num2 = scanner.nextInt();

        int num3 = num1 + num2;

        int num4 = num1 - num2;

        int num5 = num1 * num2;

        System.out.println("What is" + num1 + " + " + num2 + " = ");
        int num3_ans = scanner.nextInt();

        if (num3 == num3_ans) {
            System.out.println("You have given the correct answer.");
        } else {
            System.out.println("Sorry the correct answer is " + num3);
        }
    }
}
