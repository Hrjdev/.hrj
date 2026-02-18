import java.util.Random;
import java.util.Scanner;
public class NumberGuess {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int rNum = rand.nextInt(100);
        int rights = 0;
        System.out.println("test num : "+rNum);
        while (rights < 5){
            System.out.print("Enter a number : ");
            int guess = sc.nextInt();
            if (guess < 0 || guess > 100){
                System.out.println("Invalid Guess ! Guess a number between 0 - 100");
                continue;
            }
            if (guess == rNum){
                System.out.println("Match! bravo. The number is "+ guess);
                break;
            }else {
                System.out.println("No Match try again");
            }
            rights++;
            System.out.println(5-rights+" rights remaining.");
        }

    }
}
