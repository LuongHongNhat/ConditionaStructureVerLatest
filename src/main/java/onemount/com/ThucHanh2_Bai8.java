package onemount.com;

import java.util.Scanner;

public class ThucHanh2_Bai8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your month: ");
        int month = sc.nextInt();
        System.out.println("Please enter out year: ");
        int year = sc.nextInt();

        int[] datePerMonth;

        datePerMonth = new int[] { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if(month > 12) {
            System.out.println("Your month is invalid");
            return;
        }
        if(month != 2){
            System.out.println("Your month has " + datePerMonth[month-1] + " days");
        }else{
            if(checkLeapYear(year) == true){
                System.out.println("Your month has " + (datePerMonth[month-1] +1) + " days");
            }else{
                System.out.println("Your month has " + datePerMonth[month-1] + " days");
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
