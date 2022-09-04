import java.util.Scanner;

public class recursiveasalSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı değeri girin : ");
        int sayi = input.nextInt();
        asal(sayi, 2);

    }

    static void asal(int n1, int n2) {
        if (n1 == n2) {
            System.out.print(n1 + "asal sayıdır.");
            return;
        } else if (n1 % n2 == 0) {
            System.out.print(n1 + " asal sayı değildir.");
            return;
        }
        asal(n1, n2 + 1);
    }

    }


