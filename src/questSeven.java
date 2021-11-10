import java.util.Scanner;

public class questSeven {
    public static boolean checkingHours(int hour1 , int hour2){
        if(hour1 > hour2)
            return false;
        else
            return true;
    }

    public static void approvingForTheMeeting(int day , int amHour ,int pmHour){
        //saving office hours working in array
        int [][] array1 = {{9,17},{8,12},{0,0}};

        switch (day){
            case 1:{
                if(checkingHours(amHour , pmHour) == true) {
                    if (amHour >= array1[0][0] || pmHour <= array1[0][1]) {
                        System.out.println("You have been approved for the meeting");
                        break;
                    } else {
                        System.out.println("Sorry , you got selected an invalid hour");
                        break;
                    }
                }
                else
                    System.out.println("You got selected an invalid values");
            }// ending case first case for sunday monday wednesday thursday
            case 2:{
                if(checkingHours(amHour , pmHour) == true) {
                    if (amHour >= array1[0][0] || pmHour <= array1[0][1]) {
                        System.out.println("You have been approved for the meeting");
                        break;
                    } else {
                        System.out.println("Sorry , you got selected an invalid hour");
                        break;
                    }
                }
                else
                    System.out.println("You got selected an invalid values");
            }
            case 3:{
                if(checkingHours(amHour,pmHour)){
                    if (amHour < array1[1][0] || pmHour > array1[1][1]) {
                        System.out.println("Sorry , our offices are closed");
                        break;
                    } else {
                        System.out.println("You have been approved for the meeting");
                        break;
                    }
                }
                else
                    System.out.println("You got selected an invalid values");
            }
            case 4:{
                if(checkingHours(amHour , pmHour) == true) {
                    if (amHour >= array1[0][0] || pmHour <= array1[0][1]) {
                        System.out.println("You have been approved for the meeting");
                        break;
                    } else {
                        System.out.println("Sorry , you got selected an invalid hour");
                        break;
                    }
                }
                else
                    System.out.println("You got selected an invalid values");
            }
            case 5:{
                if(checkingHours(amHour , pmHour) == true) {
                    if (amHour >= array1[0][0] || pmHour <= array1[0][1]) {
                        System.out.println("You have been approved for the meeting");
                        break;
                    } else {
                        System.out.println("Sorry , you got selected an invalid hour");
                        break;
                    }
                }
                else
                    System.out.println("You got selected an invalid values");
            }
            case 6 :{
                System.out.println("Our offices are closed at weekend");
                break;
            }
            case 7:{
                System.out.println("Our offices are closed at weekend");
                break;
            }
            default:{
                System.out.println("You got select an invalid day");
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please , enter your coming day : ");
        int day = scanner.nextInt();
        System.out.println("Please , enter you coming hour at am :");
        int amHour = scanner.nextInt();
        System.out.println("Please , enter your coming hour at pm :");
        int pmHour = scanner.nextInt();
        approvingForTheMeeting(day,amHour,pmHour);

    }
}
