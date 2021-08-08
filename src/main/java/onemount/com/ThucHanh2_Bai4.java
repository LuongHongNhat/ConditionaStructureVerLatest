package onemount.com;

import java.util.Scanner;

public class ThucHanh2_Bai4 {
    public static void main(String[] args) {
        int aNumber, bNumber, cNumber;
        double nghiem1, nghiem2, delta;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a: ");
        aNumber = sc.nextInt();
        System.out.println("Enter b: ");
        bNumber = sc.nextInt();
        System.out.println("Enter c: ");
        cNumber = sc.nextInt();

        delta = bNumber*bNumber - (4*aNumber*cNumber);
        if (delta < 0) {
            System.out.println("Your equation vô nghiệm.");
        }else if(delta == 0){
            nghiem1 = (double) -bNumber / (2*aNumber);
            System.out.println("Your equation has nghiệm kép x = " + nghiem1);
        }else{
            nghiem1 = (float) ((-bNumber + Math.sqrt(delta)) / (2*aNumber));
            nghiem2 = (float) ((-bNumber - Math.sqrt(delta)) / (2*aNumber));
            System.out.println("Your equation has hai nghiệm x1 = " + nghiem1 + " and x2 = " + nghiem2);
        }
    }

}
