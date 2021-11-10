import java.util.Random;
import java.util.Scanner;

public class questTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min =1;
        int max = 1000;
        int cnt1 =0;
        int cnt2 =0;
        int randomNum = (int)(Math.random()*(max - min +1)+min);

        System.out.println("Guess whats the number is :");
        int firstNum = scanner.nextInt();
        System.out.println("Guess whats the number is :");
        int secondNum = scanner.nextInt();

        // first user guess
        while (firstNum != randomNum){
            if(firstNum == randomNum){
                System.out.println("you got it right");
            }
            else {
                firstNum = scanner.nextInt();
            }
            cnt1++;
        }

        while (secondNum != randomNum){
            if(secondNum == randomNum){
                System.out.println("you got it right");
            }
            else {
                secondNum = scanner.nextInt();
            }
            cnt2++;
        }
        if(cnt2>cnt1){
            System.out.println("The first guess win , in the minimum guesses , it equal to :"+cnt1);
        }else if(cnt1>cnt2){
            System.out.println("The second guess win , in the minimum guesses , it equal to :"+cnt2);
        }
        else {
            System.out.println("No one win because "+cnt1 +"equals to "+cnt2);
        }

    }
}
