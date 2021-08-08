package onemount.com;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ThucHanh2_Bai6 {

    public static void main(String[] args) {
        int i, j, temp;
        int num = 4;

        // co the cho nhap tu dong so luong con so muon nhap vao
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Input your amount of number : ");
//        amountOfNumber = sc.nextInt();

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter " + num + " number : ");

        int array[] = new int[4];
        for (i = 0; i < num; i++)
            array[i] = sc.nextInt();

        for (i = 0; i < (num - 1); i++) {
            for (j = 0; j < (num  - i - 1); j++) {
                if (array[j] > array[j +1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Ordered of your number list is : ");
        for (i = 0; i < num; i++) {
            System.out.print(array[i] + "\t");
        }
    }
}
