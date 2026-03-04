package demo_while;

public class TinhGiaTriBieuThuc {
    public static void main(String[] args) {
        //Tính giá trị biểu thức:
        // A = 1 + 1/2 + 1/3 + ... + 1/n với điều kiện 1/n>=0.025

        double A = 0;
        int i = 1;
        while(1.0/i>=0.025){
            A = A + 1.0/i;
            i++;
        }

        System.out.printf("Giá trị biểu thức cần tính A = %.2f",A);
    }
}
