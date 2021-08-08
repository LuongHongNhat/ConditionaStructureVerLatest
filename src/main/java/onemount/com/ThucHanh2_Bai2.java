package onemount.com;

import java.util.Locale;
import java.util.Scanner;

public class ThucHanh2_Bai2 {

    public static void main(String[] args) {
        System.out.println("Please enter any alphabet: ");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        //Cach 1
        int n = a.length();
        for(int i = 0; i < n; i++){
            if(Character.isUpperCase(a.charAt(i))){
                System.out.println(a.toLowerCase());
            }else{
                System.out.println(a.toUpperCase());
            }
        }
        //cach 2 ( so sanh với bảng mã ASCII )
        // ( chua nghien cuu ly do tai sao k in dc chu X và Z => chữ thường)

//        if((int)'a'<=90 && (int)'a'>=65){
//            System.out.println(a.toLowerCase());
//        }else{
//            System.out.println(a.toUpperCase());
//        }


    }
}
