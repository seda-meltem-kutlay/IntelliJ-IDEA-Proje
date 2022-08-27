import java.util.Scanner;
public class KDV {
    public static void main(String[] args) {
        double sayi , kdvOrani18= 0.18, kdvOrani8= 0.8, kdvliSonuc, hesaplananKdv,hesaplananKdv2, satir1, satir2;

        Scanner input =new Scanner(System.in);

        System.out.print("KDV hesaplamak için sayı girin: ");
        sayi = input.nextDouble();

        boolean kdvDusuk = sayi < 1000 ;
        hesaplananKdv = (sayi * kdvOrani18);
        hesaplananKdv2 = (sayi * kdvOrani8);

        satir1 = kdvDusuk ? (hesaplananKdv) : (hesaplananKdv2);
        satir2 = kdvDusuk ? (kdvOrani18) : (kdvOrani8);

        kdvliSonuc = (satir1 + sayi);

        System.out.println("KDV'siz Tutar :" + sayi);
        System.out.println("KDV oranı : " + satir2);
        System.out.println("Eklenecek KDV : " + satir1);
        System.out.println("KDV'li Tutar: " + kdvliSonuc);


    }





}
