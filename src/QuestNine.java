import java.util.Scanner;

public class QuestNine {
    // בדיקה אם מתחלק עם שאירית
    public static boolean func1(int firstNumber , int secondNumber){
        if(firstNumber % secondNumber == 0)
            return true;

        return false;
    }

    public static boolean func2(int num){
       for (int i=2; i<num; i++)
       {
           if (func1(num,i))
               return false;
       }
       return true;
    }

    // scanning a number
    public static int func3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a input");
        int input = scanner.nextInt();
        while (input <0){
            System.out.println("Please , enter a positive number");
            input = scanner.nextInt();
        }
        return input ;
    }

    public static void main(String[] args) {
        int stack1 = func3();
        boolean flag = func2(stack1);
        if(flag == true)
          System.out.println("The number is a prime number :"+ stack1);
        else
          System.out.println("The number isn't a prime number , it has a dividers :"+stack1);
    }
}
