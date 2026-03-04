package demo_ifelse;

import java.util.Scanner;

public class TimMaxMin {
    public static void main(String[] args) {
        //Chương trình tìm max,min 2 số
        int a,b;

        Scanner sc=new Scanner(System.in);
        System.out.println("Nhập số nguyên thứ nhất: ");
        a=sc.nextInt();
        System.out.println("Nhập số nguyên thứ hai: ");
        b=sc.nextInt();

        int max,min;
        if(a>b){
            max = a;
            min = b;
        }else{
            max = b;
            min = a;
        }

        System.out.println("Max của "+a+" và "+b+" là: "+max);
        System.out.println("Min của "+a+" và "+b+" là: "+min);
    }
}
