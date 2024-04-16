import java.util.Scanner;

public class NumberGame{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int minNumber = 1; // Minimum number in the range
        int maxNumber = 100; // Maximum number in the range
        int targetNumber = (int) (Math.random() * (maxNumber - minNumber + 1)) + minNumber;
        
        int maxAttempts = 10; // Maximum number of attempts
        int attempts = 0; // Counter for attempts
        
        System.out.println("HII! I AM Ganesh! WELCOME TO NUMBER Guessing Game!");
        System.out.println("I have selected a number between " + minNumber + " and " + maxNumber + ".");
        System.out.println("You have " + maxAttempts + " attempts to guess it.");
        
        while (attempts < maxAttempts) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;
            
            if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the number " + targetNumber + " correctly in " + attempts + " attempts.");
                return; // Exit the program
            }
        }
        
        // If the player couldn't guess the number within the allowed attempts
        System.out.println("Sorry, you've run out of attempts! The correct number was " + targetNumber + ".");
    }
}
