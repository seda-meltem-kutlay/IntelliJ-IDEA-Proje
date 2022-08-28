import java.util.Scanner;

public class sinifiGecmeDurumu {
    public static void main(String[] args ) {
        int mat, fizik, kimya, turkce, muzik;
        double ort;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz : ");
        mat = input.nextInt();
        System.out.print("Fizik notunuzu giriniz : ");
        fizik = input.nextInt();
        System.out.print("Kimya notunuzu giriniz :");
        kimya = input.nextInt();
        System.out.print("Türkçe notunuzu giriniz :");
        turkce = input.nextInt();
        System.out.print("Müzik notunuzu giriniz :");
        muzik = input.nextInt();
        if ((0 <= mat && mat <= 100) && (0 <= fizik && fizik <= 100) &&
                (0 <= kimya && kimya <= 100) && (0 <= turkce && turkce <= 100) &&
                (0 <= muzik && muzik <= 100)) {
        }
            ort = (mat + fizik + kimya + turkce + muzik) / 5;
        {
            if (ort >= 55) {
                System.out.println("Tebrikler, Sınıfı Geçtiniz.");
            } else {
                System.out.println("Maalesef, Sınıfta Kaldınız.");


            }
            {
                System.out.println("Girdiğiniz not değerleri 0 ile 100 aralığında olmalıdır");
            }
        }
    }
}
