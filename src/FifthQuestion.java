import java.util.Scanner;

public class FifthQuestion {
    /*
     junior workers
     50 shekel per hour
     senior employee
     200 shekel per hour
     for every worker he/she have Daily destination
     bonus 250 shekel
     func1 : if he is junior or senior , num of days he work
             return the wage to be received
      */
    public static double func1(int employee, double numOfHoursHeWorked , int numOfDayWage){
        int employeeGetted = employee;
        int numberThatWageReached = numOfDayWage;
        double numberOfWorkHours = numOfHoursHeWorked;
        double sum;
        if(employeeGetted == 1){
            sum = 200*numberOfWorkHours;
           while (numberThatWageReached>0){
               sum = sum +250 ;
               numberThatWageReached-- ;
           }
            if(sum % 10 == 0 ){
                return(int)sum;
            }
            else
                return sum;
        }else {
            if(employee == 0){
                sum = 50 * numberOfWorkHours;
                while (numberThatWageReached >0){
                    sum+= 250 ;
                    numberOfWorkHours--;
                }
                if(sum % 10 == 0 ){
                return(int)sum;
                }
                else
                    return sum;
            }
        }
        return 0;
    }
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
      // adding workers
        System.out.println("Please enter the number of workers that you want to know there wages");
        // index == number of workers that you want to know there wages
        int index = scanner.nextInt();
        for (int i=0;i<index;i++){
            if(index ==0){
                System.out.println("Please enter the hours that he worked this month :");
                double hoursWorked1 = scanner.nextDouble();
                System.out.println("Please enter the employee is he 1 or 0  :");
                int employee1 = scanner.nextInt();
                System.out.println("Please enter the num of days that you got the wage");
                int wage1 = scanner.nextInt();
                System.out.println("the wage of this worker is = "+func1(employee1,hoursWorked1,wage1));
            }else if(index == 1){
                System.out.println("Enter the next worker Working hours");
                double hoursWorked1 = scanner.nextDouble();
                System.out.println("Please enter the employee is he 1 or 0  :");
                int employee1 = scanner.nextInt();
                System.out.println("Please enter the num of days that you got the wage");
                int wage1 = scanner.nextInt();
                System.out.println("the wage of this worker is = "+func1(employee1,hoursWorked1,wage1));
            }else
                System.out.println("There's something wrong please try again");

        }

    }
}
