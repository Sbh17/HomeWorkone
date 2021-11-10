import java.util.Scanner;

public class EightQuest {

    public static int func1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();

        while(number <5 && number >20) {
            System.out.println("Your number is out of the range , please choose anther number");
            number = scanner.nextInt();
        }
        return number ;
    }
    public static void func2(int x){
       for(int i=0;i<x;i++){
           for(int j=0;j<=i;j++){
               System.out.print("*");
           }
           System.out.println("");
       }
    }
    public static void main(String[]args){
        int number = func1();
        func2(number);
    }
}
