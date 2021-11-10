import java.util.Scanner;

public class ThirdQuestion {
    public static void main(String []args){
        /*
        כתבו תוכנית הקולטת מהמשתמש שלושה מספרים ומדפיסה אותם על המסך בסדר עולה.
כלומר, אם הקלט הוא 4, 2, ו-8, עליכם להדפיס את המספרים בסדר הבא: 2, 4, 8.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println( "Enter the first number :");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter the second number :");
        int secondNumber = scanner.nextInt();

        System.out.println("Enter the third number :");
        int thirdNumber = scanner.nextInt();

        int min, max;

        if (firstNumber < secondNumber && firstNumber < thirdNumber)
            min = firstNumber;
        else
            if (secondNumber < firstNumber && secondNumber < thirdNumber)
                min = secondNumber;
            else
                min = thirdNumber;

        if (firstNumber > secondNumber && firstNumber > thirdNumber)
            max = firstNumber;
        else
            if (secondNumber > firstNumber && secondNumber > thirdNumber)
                max = secondNumber;
            else
                max = thirdNumber;

        int mid = firstNumber + secondNumber + thirdNumber - min - max;

         // printing the min
        System.out.println( "the min is :"+ min);
        System.out.println("the middle is :"+ mid);
        System.out.println("the maximum is :"+max);
    }
}
