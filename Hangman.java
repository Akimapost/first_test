import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] wordToGuess = {'h', 'a', 'n', 'g', 'm', 'a', 'n'};
        char[] guessedLetters = new char[wordToGuess.length];
        int incorrectGuesses = 0;

        for (int i = 0; i < guessedLetters.length; i++) {
            guessedLetters[i] = '_';
        }

        while (incorrectGuesses < 6) {
            System.out.println("Guessed word: " + new String(guessedLetters));
            System.out.print("Guess a letter or the entire word: ");
            String guess = scanner.nextLine();

            if (guess.length() == 1) {
                char letter = guess.charAt(0);
                boolean correctGuess = false;

                for (int i = 0; i < wordToGuess.length; i++) {
                    if (wordToGuess[i] == letter) {
                        guessedLetters[i] = letter;
                        correctGuess = true;
                    }
                }

                if (!correctGuess) {
                    System.out.println("Incorrect guess! Tries left: " + (6 - (++incorrectGuesses)));
                }
            } else {
                if (guess.equals(new String(wordToGuess))) {
                    System.out.println("Congratulations! You guessed the word correctly: " + new String(wordToGuess));
                    break;
                } else {
                    System.out.println("Incorrect guess! Tries left: " + (6 - (++incorrectGuesses)));
                }
            }

            if (new String(guessedLetters).equals(new String(wordToGuess))) {
                System.out.println("Congratulations! You guessed the word correctly: " + new String(wordToGuess));
                break;
            }
        }

        if (!new String(guessedLetters).equals(new String(wordToGuess))) {
            System.out.println("Sorry, you've run out of tries. The word was: " + new String(wordToGuess));
        }

        scanner.close();
    }
}

