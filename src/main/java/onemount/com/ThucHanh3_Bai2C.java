package onemount.com;

import java.util.Scanner;

public class ThucHanh3_Bai2C {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your day: ");
        int day = sc.nextInt();
        System.out.println("Please enter out month: ");
        int month = sc.nextInt();
        System.out.println("Please enter out year: ");
        int year= sc.nextInt();
        String nextDay ="";

        int[] datePerMonth;
        datePerMonth = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if(month > 12) {
            System.out.println("Your month is invalid");
            return;
        }

        if(checkLeapYear(year) == false){
            if(day <= datePerMonth[month-1]){
                if( 2 <= day && day <= datePerMonth[month-1]){
                    System.out.println("Your previous day is " + (day - 1) + "/ " + month + "/ " + year);
                }else if(day == 1 && month > 1){
                    System.out.println("Your previous day is " + datePerMonth[month-2] + "/ " + (month - 1) + "/ " + year);
                }else{
                    System.out.println("Your previous day is 31 / 12 / " + year);
                }
            }else{
                System.out.println("Your day is invalid");
            }
        }else{
            if(month != 2){
                if(day <= datePerMonth[month-1]){
                    if( 2 <= day && day <= datePerMonth[month-1]){
                        System.out.println("Your previous day is " + (day - 1) + "/ " + month + "/ " + year);
                    }else if(day == 1 && month > 1){
                        System.out.println("Your previous day is " + datePerMonth[month-2] + "/ " + (month - 1) + "/ " + year);
                    }else{
                        System.out.println("Your previous day is 31 / 12 / " + (year -1));
                    }
                }else{
                    System.out.println("Your day is invalid");
                }
            }else{
                if(day <= datePerMonth[month-1] + 1){
                    if( 2 <= day && day <= datePerMonth[month-1] + 1){
                        System.out.println("Your previous day is " + (day - 1) + "/ " + month + "/ " + year);
                    }else if(day == 1 && month > 1){
                        System.out.println("Your previous day is " + datePerMonth[month-2] + "/ " +   (month - 1) + "/ " + year);
                    }else{
                        System.out.println("Your previous day is 31 / 12 / " + (year - 1));
                    }
                }else{
                    System.out.println("Your day is invalid");
                }
            }
        }
    }

    private static boolean checkLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }

    }

}
