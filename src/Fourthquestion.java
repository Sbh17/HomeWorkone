import java.util.Scanner;

public class Fourthquestion {
    public static void main (String []args){
        /*
        כתבו תוכנית לפתרון משוואה ריבועית (לנוחיותכם, הנוסחה לפתרון המשוואה הריבועית מצורפת לתרגיל זה).
המשתמש יתבקש להכניס ערכים עבור הפרמטרים a, b ו-c.
ייתכנו שלושה סוגי פתרונות למשוואה ריבועית:
-משוואה בעלת שני פתרונות – במצב זה יש להדפיס כי נמצאו שני פתרונות למשוואה, ואז להדפיס את הפתרונות x1 ו-x2.
-משוואה בעלת פתרון אחד – במצב זה יש להדפיס כי נמצא פתרון אחד בלבד, ואז להדפיס את הפתרון.
-משוואה שאין לה פתרון – במצב כזה יש להדפיס כי לא נמצא פתרון עבור המשוואה הריבועית

         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the numbers of the quadratic equation");

        System.out.println("enter the first parameter value ");
        int a = scanner.nextInt();
        System.out.println("enter the second parameter value ");
        int b = scanner.nextInt();
        System.out.println("enter the third parameter value ");
        int c = scanner.nextInt();
        // printing the quadratic equation
        System.out.println(a+"x^2 +"+ b+"x + "+ c );

        // quadratic equation solution
        double firstSol , secondSolution ;
        double resultOfSqrt = Math.sqrt(Math.abs(b*b-4*a*c));
        firstSol = (-b + resultOfSqrt ) /(2*a);
        secondSolution = (-b - resultOfSqrt ) / (2*a);

        if (firstSol % 10 == 0)
            System.out.println("The first solution is :"+(int)firstSol);
        else
            System.out.println("The first solution is :"+firstSol);

    if(secondSolution % 10 == 0)
     System.out.println("The second solution is :"+(int)secondSolution);
    else
        System.out.println("the second solution is :"+ secondSolution);




    }
}
