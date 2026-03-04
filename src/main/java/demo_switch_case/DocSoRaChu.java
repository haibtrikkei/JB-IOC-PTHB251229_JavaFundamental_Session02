package demo_switch_case;

import java.util.Scanner;

public class DocSoRaChu {
    public static void main(String[] args) {
        int so;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số có 3 chữ số: ");
        so = sc.nextInt();

        if (so < 100 || so > 999) {
            System.out.println("Số nhập vào không đúng!");
            return;
        }

        int tram, chuc, donvi;

        tram = so / 100;
        chuc = (so % 100) / 10;
//        chuc = (so/10)%10;
        donvi = so % 10;

        switch (tram) {
            case 1:
                System.out.print("Một trăm ");
                break;
            case 2:
                System.out.print("Hai trăm ");
                break;
            case 3:
                System.out.print("Ba trăm ");
                break;
            case 4:
                System.out.print("Bốn trăm ");
                break;
            case 5:
                System.out.print("Năm trăm ");
                break;
            case 6:
                System.out.print("Sáu trăm ");
                break;
            case 7:
                System.out.print("Bảy trăm ");
                break;
            case 8:
                System.out.print("Tám trăm ");
                break;
            case 9:
                System.out.print("Chín trăm ");
                break;
        }

        switch (chuc) {
            case 0:
                if(donvi!=0)
                    System.out.print("linh ");
                break;
            case 1:
                System.out.print("mười ");
                break;
            case 2:
                System.out.print("hai mươi ");
                break;
            case 3:
                System.out.print("ba mươi ");
                break;
            case 4:
                System.out.print("bốn mươi ");
                break;
            case 5:
                System.out.print("năm mươi ");
                break;
            case 6:
                System.out.print("sáu mươi ");
                break;
            case 7:
                System.out.print("bảy mươi ");
                break;
            case 8:
                System.out.print("tám mươi ");
                break;
            case 9:
                System.out.print("chín mươi ");
                break;
        }

        switch (donvi) {
            case 1:
                if(chuc<2)
                    System.out.print("một");
                else
                    System.out.print("mốt");
                break;
            case 2:
                System.out.print("hai");
                break;
            case 3:
                System.out.print("ba");
                break;
            case 4:
                System.out.print("bốn");
                break;
            case 5:
                if(chuc==0){
                    System.out.print("năm");
                }else{
                    System.out.print("lăm");
                }
                break;
            case 6:
                System.out.print("sáu");
                break;
            case 7:
                System.out.print("bảy");
                break;
            case 8:
                System.out.print("tám");
                break;
            case 9:
                System.out.print("chín");
                break;
        }
        System.out.println();
    }
}
