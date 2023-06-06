package Algaritm;

public class Lessen7 {
    static int i = 0;
    public static void hanoi(int n, String from, String tmp, String to) {
        if (n == 1) {
            i++;
            System.out.printf( i + "Перемести из %s, в %s%n", from, to);
            return;
        }
        hanoi(n - 1, from, to, tmp);
        i++;
        System.out.printf(i +"Перемести из %s, в %s%n", from, to);
        hanoi(n - 1, tmp, from, to);
    }

    public static void main(String[] args) {
        hanoi(4,"Pole 1","Pole 2","Pole 3");
    }
}
