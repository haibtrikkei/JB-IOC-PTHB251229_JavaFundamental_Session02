package demo_do_while;

import java.util.Scanner;

public class Validate_DuLieu {
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
                boolean check = true;
                for(int i = 0; i < strA.length(); i++) {
                    if(!isDigit(strA.charAt(i))) {
                        System.out.println("Bạn phải nhập là số");
                        check = false;
                        break;
                    }
                }

                if(check) {
                    a = Integer.parseInt(strA);
                    if(a==0){
                        System.out.println("Phải nhập a!=0");
                    }else{
                        break;
                    }
                }
            }
        } while (a==0);
    }

    private static boolean isDigit(char ch) {
        switch (ch) {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                return true;
        }
        return false;
    }
}
