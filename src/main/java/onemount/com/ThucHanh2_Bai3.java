package onemount.com;

import java.util.Scanner;

public class ThucHanh2_Bai3 {
    public static void main(String[] args) {
        int aNumber, bNumber;
        double nghiem;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a: ");
        aNumber = sc.nextInt();
        System.out.println("Enter b: ");
        bNumber = sc.nextInt();

        System.out.println("Your equation is: " + aNumber + "x + " + bNumber + " = 0.");
        if (aNumber == 0) {
            if (bNumber == 0) {
                System.out.println("Your equation has vô số nghiệm.");
            } else {
                System.out.println("Your equation has vô nghiệm.");
            }
        } else {
            nghiem = (double) -bNumber / aNumber;
            System.out.println("Your equation has nghiệm x =" + nghiem +".");
        }
    }

}
