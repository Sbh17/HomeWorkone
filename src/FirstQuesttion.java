import java.util.Scanner;


public class FirstQuesttion {
    public static void main(String []args){
       /*
       כתבו תוכנית הקולטת מהמשתמש מספר שלם כלשהו, ומדפיסה על המסך את הערך המוחלט שלו.
        */
        // קלוט את המספר

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        System.out.println("The absolute value of the number is : "+Math.abs(number));
    }
}
