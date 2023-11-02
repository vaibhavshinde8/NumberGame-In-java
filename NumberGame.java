import java.util.Scanner;
import java.util.Random;

public class NumberGame {
    public static void main(String[] args) {
        Scanner st = new Scanner(System.in);
        Random rndm = new Random();
        int min_num = 1;
        int max_num = 100;
        int max_attempts = 5;
        int score = 0;

        System.out.println("Number Game :");
        while (true) {
            int generated_num = rndm.nextInt(100);
            int attempts = 0;
            int guess_num;
            while (attempts < max_attempts) {
                System.out.println("enter your number to guess actual number :");
                guess_num = st.nextInt();
                attempts++;

                if (guess_num < generated_num) {
                    System.out.println("The number you have guessed is smaller then the generated number! try again ");
                } else if (guess_num > generated_num) {
                    System.out.println("The number you have guessed is bigger then the generated number! try again ");
                } else {
                    System.out.println(
                            "You have guessed the right number " + generated_num + " in " + attempts + " attempts");
                    score++;
                    break;
                }

                if (attempts == max_attempts) {
                    System.out
                            .println("You have reached the maximum limit to guess the number . The correct number is : "
                                    + generated_num);
                }

            }
            System.out.println("Do you want to play again? Yes/No :");
            String play_more = st.next().toLowerCase();

            if (!play_more.equals("yes")) {
                System.out.println("Your score is : " + score + " in number of attempts :" + attempts);
                break;
            }
        }
        st.close();
    }
}
