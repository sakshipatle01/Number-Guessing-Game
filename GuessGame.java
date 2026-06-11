import java.util.Scanner;
import java.util.Random;

public class GuessGame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int randomNumber = rand.nextInt(10) + 1; // 1 to 10
        int attempts = 5;

        System.out.println("🎮 Welcome to Funny Number Guessing Game!");
        System.out.println("👉 I have selected a number between 1 to 10");
        System.out.println("👉 You have only " + attempts + " chances!");
        System.out.println("😂 Let's see if you can beat me!\n");

        for (int i = 1; i <= attempts; i++) {

            System.out.print("🔢 Attempt " + i + " - Enter your guess: ");
            int guess = sc.nextInt();

            if (guess == randomNumber) {
                System.out.println("🎉 WOW! You got it right!");
                System.out.println("😎 You are smarter than my algorithm!");
                break;
            } 
            else if (guess > randomNumber) {
                System.out.println("📈 Too Big bro! Thoda chhota socho 😆");
                System.out.println("😂 Hint: Tum rocket launch kar rahe ho kya?\n");
            } 
            else {
                System.out.println("📉 Too Small bro! Thoda bada try karo 😜");
                System.out.println("🤣 Hint: Itna chhota number toh ant bhi has de!\n");
            }

            if (i == attempts) {
                System.out.println("💀 Game Over!");
                System.out.println("😢 Correct number was: " + randomNumber);
                System.out.println("😂 Better luck next time genius!");
            }
        }

        sc.close();
    }
}