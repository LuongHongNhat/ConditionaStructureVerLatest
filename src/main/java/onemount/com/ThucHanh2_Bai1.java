package onemount.com;

import java.util.Scanner;

public class ThucHanh2_Bai1 {
    public static void main(String[] args){
        int number;
        int[] myNum = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        System.out.println("Please enter any number:");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        if(number == 1){
            System.out.println("Your number is one");
        }else if(number == 2){
            System.out.println("Your number is two");
        }else if(number == 3){
            System.out.println("Your number is three");
        }else if(number == 4){
            System.out.println("Your number is four");
        }else if(number == 5){
            System.out.println("Your number is five");
        }else if(number == 6){
            System.out.println("Your number is six");
        }else if(number == 7){
            System.out.println("Your number is seven");
        }else if(number == 8){
            System.out.println("Your number is eight");
        }else if(number == 9){
            System.out.println("Your number is nine");
        }else {
            System.out.println("Your number is invalid");
        }

    }

}
