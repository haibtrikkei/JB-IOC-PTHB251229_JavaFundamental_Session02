package demo_do_while;

import java.util.Scanner;

public class Validate_DuLieu_TryCatch {
    public static void main(String[] args) {
        //Validate yêu cầu người dùng nhập hệ số a !=0
        int a = 0;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Nhập hệ số a: ");
            String strA = sc.nextLine();
            if (strA.isEmpty()) {
                System.out.println("Bạn phải nhập dữ liệu");
            } else {
                try{
                    a = Integer.parseInt(strA);
                    if(a==0){
                        System.out.println("Bạn phải nhập a!=0");
                    }
                }catch(Exception e){
                    System.out.println("Bạn phải nhập vào số");
                }
            }
        } while (a==0);
    }
}
