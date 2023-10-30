import java.util.Scanner;

public class HangmanGame {
    private static final String[] WORDS = { "programming", "hangman", "java", "computer", "algorithm" };
    private static final int MAX_TRIES = 6;

    private String wordToGuess;
    private char[] wordProgress;
    private int triesLeft;

    public HangmanGame() {
        wordToGuess = getRandomWord();
        wordProgress = new char[wordToGuess.length()];
        for (int i = 0; i < wordProgress.length; i++) {
            wordProgress[i] = '_';
        }
        triesLeft = MAX_TRIES;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Word: " + new String(wordProgress));
            System.out.println("Tries left: " + triesLeft);

            System.out.print("Guess a letter: ");
            char guess = scanner.next().charAt(0);

            if (wordToGuess.indexOf(guess) >= 0) {
                for (int i = 0; i < wordToGuess.length(); i++) {
                    if (wordToGuess.charAt(i) == guess) {
                        wordProgress[i] = guess;
                    }
                }
            } else {
                triesLeft--;
            }

            if (wordToGuess.equals(new String(wordProgress))) {
                System.out.println("Congratulations! You guessed the word: " + wordToGuess);
                break;
            }

            if (triesLeft == 0) {
                System.out.println("You lost! The word was: " + wordToGuess);
                break;
            }
        }

        scanner.close();
    }

    private String getRandomWord() {
        int randomIndex = (int) (Math.random() * WORDS.length);
        return WORDS[randomIndex];
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Hangman!");
        HangmanGame hangman = new HangmanGame();
        hangman.play();
    }
}
