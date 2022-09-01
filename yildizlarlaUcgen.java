import java.sql.SQLOutput;
import java.util.Scanner;

public class yildizlarlaUcgen {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını giriniz :");
        n = input.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int k = 0; k <= (n - i); k++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int y = 0; y <= n; y++) {
            for (int z = 0; z <= y; z++) {
                System.out.print(" ");
            }
            for (int p = 1; p <= 2 * (n - y) - 1; p++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}


