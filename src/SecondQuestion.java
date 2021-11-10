import java.util.Scanner;

public class SecondQuestion {
    public  static void main(String []args){
        /*
        כתבו תוכנית הקולטת מהמשתמש שני מספרים, ומדפיסה על המסך האם הסכום שלהם הוא זוגי או אי זוגי.
        לדוגמה, אם הוכנסו המספרים 5 ו-7, עלינו להדפיס שהסכום הוא זוגי, כיוון ש-5+7 שווה 12, ו-12 הוא מספר זוגי.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter the second number : ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;

        if(sum % 2 == 0 ){
            System.out.println("The sum of the numbers :" + firstNumber + "+"+ secondNumber +" = " + sum +" is even sum ");
        }
        else{
            System.out.print("The sum of the numbers :"+ firstNumber + "+"+ secondNumber +" = " + sum +" is odd sum");
        }

    }
}
