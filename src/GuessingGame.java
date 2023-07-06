public class GuessingGame {
    public static void main(String[] args) {
        int secretNumber = 7;
        int guess = 9;

        if(guess == secretNumber) {
            System.out.println("You are correct");
        } else if(guess>secretNumber) {
            System.out.println("Your number is too high");
        } else if(guess<secretNumber){
            System.out.println("Your number is too low");
        }

    }
}
