import java.util.random.*;
import java.util.Random;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class TimedSumGame3 implements Game3{
    private int quickTimer;
    private TimedSumGame3(int quickTimer){
        this.quickTimer = quickTimer;
    }

    public static TimedSumGame3 timedSumGame3FactoryMethod() {
        int quickTimer = 5000; //5secs
        return new TimedSumGame3(quickTimer);
        
    }
    @Override
    public int play(){
        Random randoM = new Random();
        int randNum = randoM.nextInt(99);
        int randNum2 = randoM.nextInt(99);

        while(quickTimer>0){
            Timer timer = new Timer();
            TimerTask task = new TimerTask(){

                @Override
                public void run(){
                    System.out.println("Time is up! \u23F3");
                    timer.cancel(); //terminates the timer thread
                    System.exit(0);
                }

            }; timer.schedule(task, quickTimer);
        

        Scanner inputSumNumber = new Scanner(System.in);
        System.out.println("Enter the sum of: " + randNum + "+" + randNum2);
        int sumOfNumber = inputSumNumber.nextInt();

        if(sumOfNumber == randNum + randNum2){
            System.out.print("You are right!");
            break;
        }
        else if (sumOfNumber != randNum + randNum2){
            System.out.println("Answer is incorrect, try again.");
        }

    } System.exit(0);
    return quickTimer;
}
}