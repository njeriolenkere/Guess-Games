import java.util.Random;
import java.util.Scanner;
public class SumGame3 implements Game3{
    //constructor
    private int numberOfTrial;
    private SumGame3(int numberOfTrials){
        this.numberOfTrial=numberOfTrials;
    }
    //factoryMethod
    public static SumGame3 sumGame3FactoryMethod(){
        int numberOfTrial = 3;
        return new SumGame3(numberOfTrial);
    }

    @Override
    public int play() {

        Random random = new Random();
        int randomOne = random.nextInt(21);
        int randomTwo = random.nextInt(21);

        while(numberOfTrial>0) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("What is the sum of: "
                    + randomOne +" + " + randomTwo + " " );
            int sumNumber = scanner.nextInt();
            numberOfTrial--;

            if (sumNumber == randomOne + randomTwo) {
                System.out.println("You are correct!");
                break;
            } else if (sumNumber != randomOne+randomTwo) {
                System.out.println("Calculate again!");
            }

        }
        System.out.println("You have" +" " + numberOfTrial +
                " " +"chances ramaining. Hasta la vista \uD83D\uDC7D");
        return numberOfTrial;
    }

}


