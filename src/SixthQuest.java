import java.util.Scanner;

public class SixthQuest {
    /*
    סדרה חשבונית היא סדרת מספרים
    הפרש בין כל איבר מספר קבוע
    הפןנקציה מקבלת איבר ראשון ו הפרש הסדרה ו מספר האיברים
    והיא מדפיסה את האיברים
     */
    public static void func1(int numOfOrgans , int firstOrgan , int seriesDifference){
        // the number of organs in the series
        int theOrgans = numOfOrgans;
        // the series difference
        int difference = seriesDifference;
        int theFirstOrgan = firstOrgan;

        // printing the series ;
        for (int i=0;i<theOrgans;i++){
            int organSum=theFirstOrgan+ (i*difference);
           System.out.println("The organ on this place ="+ organSum);
        }
    }
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of organ");
        int numberOfOrgans = scanner.nextInt();

        System.out.println("Enter the first organ :");
        int firstOrgan = scanner.nextInt();

        System.out.println("Enter the series difference :");
        int difference = scanner.nextInt();

       func1(numberOfOrgans,firstOrgan,difference);


    }
}
