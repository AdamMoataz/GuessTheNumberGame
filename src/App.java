
import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("welcome to guess the number game ");
    /*
    First Step: Computer thinks of a number 0 to 101 then tells you to guess it.
    Second Step if you are way to far from the number computer will tell u go lower and if ur already lower it will say go higher.
    Third And Final Step: After u guess the number computer will say u have guessed the number in however much tries it took u to guess it.  
    */
        //    first step
        Random random= new Random();
        int random_number=random.nextInt(101);
        int number_of_tries=0;
        boolean has_guessed_correctly= false;
        Scanner scanner=new Scanner(System.in);

        while(!has_guessed_correctly){
            System.out.println("Enter your guess");
            int user_guess=scanner.nextInt();
            if(user_guess<random_number){
                System.out.println("guess is higher");
            }
            else if(user_guess>random_number){
            System.out.println("guess is lower");
            }
            else {
            System.out.println("guess is correct");
            has_guessed_correctly=true;
            }
           
        }
    }
} 
