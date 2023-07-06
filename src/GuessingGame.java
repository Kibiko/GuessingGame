public class GuessingGame {
    public static void main(String[] args) {

        int secretNumber = 23;
        int guess = 23;

        String result = guess > secretNumber ? "Too High!" : guess < secretNumber ? "Too Low!": "Correct!";

        System.out.println(result);

    }
}
