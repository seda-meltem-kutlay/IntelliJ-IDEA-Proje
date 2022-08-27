import java.util.Scanner;

public class vucutKitleİndeksi {
    public static void main(String[] args ) {
        double m,kg, sonuc;
        Scanner index= new Scanner(System.in);
        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
        m = index.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz : ");
        kg = index.nextDouble();
        sonuc = kg/(m*m);
        System.out.println("Vücut Kitle İndeksiniz: "+sonuc);

    }
}
