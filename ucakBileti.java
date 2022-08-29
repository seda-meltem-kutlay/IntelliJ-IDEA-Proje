import java.util.Scanner;

public class ucakBileti {
    public static void main(String[] args) {
        int km,yas,yolculukTipi;
        double fiyat,indirim,indirimliFiyat,gidisDonus;

        Scanner inp = new Scanner(System.in);

        System.out.print("Mesafeyi 'KM' türünden giriniz: ");
        km = inp.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        yas = inp.nextInt();

        System.out.print("Yolculuk tipini giriniz (1=> Tek Yön, 2=> Gidiş Dönüş): ");
        yolculukTipi= inp.nextInt();

        // KM başına ücret
        fiyat = km * 0.10;

        // Mesafe ve yaş pozitif, yolculuk tipi 1 ve 2 olmalı
        if(km<0 || yas<0 || (yolculukTipi !=1 && yolculukTipi !=2))
            System.out.println("Hatalı değer girdiniz, lütfen tekrar deneyiniz.");

        // İndirim Uygulanması
        if(yas<12) {
            indirim = fiyat * 0.50;
            indirimliFiyat= fiyat - indirim;
        } else if(yas<=24) {
            indirim = fiyat * 0.10;
            indirimliFiyat = fiyat - indirim;
        } else if(yas>=65) {
            indirim = fiyat * 0.30;
            indirimliFiyat = fiyat - indirim;
        } else {
            indirimliFiyat = fiyat;
        }
        // Yolculuk tipine göre indirim uygulanması
        if(yolculukTipi == 2) {
            gidisDonus = indirimliFiyat - (indirimliFiyat * 0.20);
            System.out.println("Toplam tutar: " + gidisDonus * 2);
        } else if(yolculukTipi== 1){
            System.out.println("Toplam tutar: "+ indirimliFiyat);
        }
    }
}