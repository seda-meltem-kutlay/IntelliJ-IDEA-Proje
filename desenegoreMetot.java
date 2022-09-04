import java.util.Scanner;

public class desenegoreMetot {
    public static void main(String[] args) {
        int a;
        System.out.print("Sayı değeri girin : ");
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        int b = a;
        desen(a, b);
    }

    static void desen(int a, int b) {
        if (a > 0) {
            System.out.print(a + " ");
            desen(a - 5, b);

        } else {
            desenc(a, b);
        }
    }

    static void desenc(int a, int b) {

        System.out.print(a + " ");
        if (a < b) {
            desenc(a + 5, b);

        }
    }
}



