package onemount.com;

import java.util.Scanner;

public class ThucHanh2_Bai9 {
    public static void main(String[] args) {
        int edgeA, edgeB, edgeC;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a: ");
        edgeA = sc.nextInt();
        System.out.println("Enter b: ");
        edgeB = sc.nextInt();
        System.out.println("Enter c: ");
        edgeC = sc.nextInt();

        if(edgeA > edgeB + edgeC || edgeB > edgeA + edgeC || edgeC > edgeA + edgeB) {
            System.out.println("Your 3 edge value is not a triangle");

        }else{
            if(edgeA == edgeB && edgeB == edgeC){
                System.out.println("This is equilateral triangle");
            }else if(edgeA == edgeB || edgeB == edgeC || edgeA == edgeC){
                System.out.println("This is isosceles triangle");
            }else if(edgeA*edgeA == edgeB*edgeB + edgeC*edgeC || edgeB*edgeB == edgeA*edgeA + edgeC*edgeC || edgeC*edgeC == edgeA*edgeA + edgeB*edgeB){
                System.out.println("This is square triangle");
            }else{
                System.out.println("This is normal triangle");
            }
        }
    }

}
