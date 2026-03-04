package demo_ifelse;

import java.util.Scanner;

public class GiaiPTB2 {
    public static void main(String[] args) {
        int a, b, c;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập hệ số a: ");
        a = sc.nextInt();
        System.out.println("Nhập hệ số b: ");
        b = sc.nextInt();
        System.out.println("Nhập hệ số c: ");
        c = sc.nextInt();

        int delta = b * b - 4 * a * c;

        if(delta<0){
            System.out.println("Phương trình vô nghiệm");
        }else if (delta==0){
            float x = (float)-b/(2*a);
//            System.out.println("Phương trình có nghiệm kép x1=x2="+x);
            System.out.printf("Phương trình có nghiệm kép x1=x2=%.1f",x);
        }else{
            float x1 = (float) ((-b-Math.sqrt(delta))/(2*a));
            float x2 = (float) ((-b+Math.sqrt(delta))/(2*a));
            System.out.println("Phương trình có 2 nghiệm phân biệt: ");
            System.out.printf("\tx1 = %.1f",x1);
            System.out.printf("\n\tx2 = %.1f",x2);
        }
    }
}
