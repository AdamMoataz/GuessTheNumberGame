
import java.util.Scanner;

public class Assignment {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.next();
        System.out.println(" Hello " + name);
        System.out.println(name + " you will be answering some math questions today");

        int score = 0;
        System.out.println("What is 5+3");
        int a1 = scanner.nextInt();
        if (a1 == 8) {
            score=score+10;
            System.out.println("Correct! Your score now is " + score);

        } else {
           score=score-5;
        }

        System.out.println("What is 10-2");
        int a2 = scanner.nextInt();
        if (a2 == 8) {
            score=score+10;
            System.out.println("Correct! Your score now is " + score);

        } else {
            score=score-5;
        }

        System.out.println("What is 4+9");
        int a3 = scanner.nextInt();
        if (a3 == 13) {
           score=score+10;
            System.out.println("Correct! Your score now is " + score);

        } else {
            score=score-5;
        }

         System.out.println("What is 17+4");
        int a4 = scanner.nextInt();
        if (a4 == 13) {
           score=score+10;
            System.out.println("Correct! Your score now is " + score);

        } else {
            score=score-5;
        }

         System.out.println("What is 10-7");
        int a5 = scanner.nextInt();
        if (a5 == 13) {
           score=score+10;
            System.out.println("Correct! Your score now is " + score);

        } else {
            score=score-5;
        }

    }

}
