import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select game:\n1) " +
                "Guess Game\n2) Sum Game\n3) TimedSum Game\n0) Exit ");
        int gameChoose = scanner.nextInt();

        Game3 game3 = null;
        switch (gameChoose) {
            case 1:
                game3 = GuessGame3.guessGame3FactoryMethod();
                break;

            case 2:
                game3 =SumGame3.sumGame3FactoryMethod();
                break;

            case 3:
                game3 =TimedSumGame3.timedSumGame3FactoryMethod();
                break;    

            default: System.out.println("Hejdå \uD83D\uDE00 "); //Unicode Code \u1F590
                System.exit(0);

        } game3.play();
    }

}
