import java.util.Scanner;

public class ortalama {
    public static void main(String[] args) {
        // 3 ve 4'e tam bolunen sayilarin ortalamalari


        double sayi,toplam = 0,sonuc,sayac = 0;


        Scanner scan = new Scanner(System.in);

        System.out.print("Lütfen işlem yapmak istediğiniz sayıyı giriniz : ");
        sayi = scan.nextDouble();

        for(int i = 1; i<sayi;i++) {
            if(i % 3 == 0 && i % 4 == 0) {
                toplam += + i;
                sayac++;
                System.out.println("Bulunan sayı : " + i);

            }
        }sonuc = toplam/sayac;
        System.out.println("Sonuc  : " + sonuc);
    }
}

