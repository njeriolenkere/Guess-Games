
import java.util.Random;
import java.util.Scanner;
public class GuessGame3 implements Game3 {
    private int randNumber;
    //constructa
    private GuessGame3(int randomNumber){
        this.randNumber=randomNumber;
    }
    //factory method
    public static GuessGame3 guessGame3FactoryMethod(){
        int min = 0;
        int max = 0;
        min =getInterval("min");//get min guess interval
        max =getInterval("max");//get min guess interval
        int randomNumber = getRandom(min, max); //generate random no.
        return new GuessGame3(randomNumber);
    }
    static int getInterval(String text){
        System.out.println("Enter input "  + text + " " +
                "number to generate random number");
        Scanner inputMin = new Scanner(System.in);
        return  Integer.parseInt(inputMin.nextLine());
    }
    static int getRandom(int min, int max){
        Random random = new Random();
        return random.nextInt(max - min) + min;
    }
    @Override
    public int play() {
        //random generator
        //Random random = new Random();
        // int randomNumber = random.nextInt(99);
        int numberOfGuess= 0;

        while (true){
            System.out.println("Enter your guess number");
            Scanner scanner = new Scanner(System.in);
            int inputGuess = scanner.nextInt();

            numberOfGuess++;

            if (inputGuess == randNumber){
                System.out.println("You are correct! Random number is: " + randNumber);
                break;
            } else if (inputGuess < randNumber) {
                System.out.println("try a bigger number");

            } else if (inputGuess > randNumber) {
                System.out.println("try a smaller number");
            }
        }System.out.println("You have guessed : " + numberOfGuess +
                " " + "times \uD83E\uDD29");
        return randNumber;
    }

}


