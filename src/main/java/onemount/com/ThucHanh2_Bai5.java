package onemount.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThucHanh2_Bai5 {
    public static void main(String[] args) {
        int maxNumber = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number a : ");
        int a = sc.nextInt();
        System.out.println("Please enter number b : ");
        int b = sc.nextInt();
        System.out.println("Please enter number c : ");
        int c = sc.nextInt();
        System.out.println("Please enter number d : ");
        int d = sc.nextInt();

        List<Integer> myNumberList = new ArrayList<Integer>();
        myNumberList.add(a);
        myNumberList.add(b);
        myNumberList.add(c);
        myNumberList.add(d);
        for (int i = 0; i < myNumberList.size(); i++) {
            if(myNumberList.get(i) > maxNumber){
                maxNumber = myNumberList.get(i);
            }
        }
        System.out.println("Your maximum number is " + maxNumber);
    }
}
