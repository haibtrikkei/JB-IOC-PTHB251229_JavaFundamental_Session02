package demo_hinhsao;

import java.util.Scanner;

public class TamGiacSaoCan {
    public static void main(String[] args) {
        int sodong;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số dòng của tam giác cần in: ");
        sodong = sc.nextInt();
        System.out.println("-------- Tam giác cần in --------");
        for (int i = 1; i <= sodong; i++) {
            int sotab = sodong - i; // In số tab ở đầu của mỗi dòng
            for(int j=1;j<=sotab;j++){
                System.out.print("\t");
            }
            int sosao = 2*i-1; // In số sao trên 1 dòng
            for(int j=1;j<=sosao;j++){
                System.out.print("*\t");
            }
            System.out.println(); //In hết 1 dòng thì xuống dòng
        }

    }
}
