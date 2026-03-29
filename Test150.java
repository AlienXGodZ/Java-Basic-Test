//Number Guessing Game

public class Test150 {
    public static void main(String[] args) {

        int secret = 7;

        // predefined guesses (simulating user input)
        int[] guesses = {2, 5, 9, 7};

        for(int i = 0; i < guesses.length; i++) {

            int guess = guesses[i];

            System.out.println("Guess: " + guess);

            if(guess < secret) {
                System.out.println("Too small");
            }
            else if(guess > secret) {
                System.out.println("Too big");
            }
            else {
                System.out.println("Correct!");
                break; // stop when correct
            }
        }
    }
}