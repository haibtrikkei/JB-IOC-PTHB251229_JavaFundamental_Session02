package demo_for;

public class InGiaTri {
    public static void main(String[] args) {
        for (int i = 1, j = 7; i < 5 && j > 4; i++, j--) {
            System.out.println(i + " + " + j + " = " + (i + j));
        }
    }
}

/*
 i = 1 -> 4
 j = 7 -> 5 => i = 1 -> 3

 1 + 7 = 8
 2 + 6 = 8
 3 + 5 = 8
 */