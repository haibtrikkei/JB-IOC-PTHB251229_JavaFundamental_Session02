package demo_for;

public class TinhTongBang1VongLap {
    public static void main(String[] args) {

        for(int i = 1, tong = 0; i<=100 ; i++){
            tong = tong + i;
            if(i<=99){
                continue;
            }

            System.out.println("Tổng từ 1 đến 100 là: "+tong);
        }

    }
}
