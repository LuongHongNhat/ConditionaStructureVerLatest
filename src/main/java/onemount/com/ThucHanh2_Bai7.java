package onemount.com;

import java.util.Scanner;

public class ThucHanh2_Bai7 {

    public static void main(String[] args) {
        System.out.println("Please enter your km : ");
        Scanner sc = new Scanner(System.in);
        int km = sc.nextInt();
        int firstKmPrice = 15000;
        int nextFourKm = 13500;
        int fromTheSixKm = 11000;
        int totalAmount = 0;

        if(km == 1){
            totalAmount = km * firstKmPrice;
            System.out.println("Your total amount must pay is " + totalAmount);
        }
        if (km <= 5 && km >=2){
            totalAmount = firstKmPrice + ((km - 1) * nextFourKm);
            System.out.println("Your total amount must pay is " + totalAmount);
        }
        if (km > 6) {
            totalAmount = firstKmPrice + (4 * nextFourKm) + ((km - 5) * fromTheSixKm);
            System.out.println("Your total amount must pay is " + (totalAmount * 90 / 100));
        }


    }
}
