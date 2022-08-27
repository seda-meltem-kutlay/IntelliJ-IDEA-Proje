import java.util.Scanner;

public class manavKasaProgrami {
    public static void main(String[] args) {
        double armutKilosu=2.14, elmaKilosu= 3.67, domatesKilosu= 1.11, muzKilosu=0.95, patlicanKilosu=5.00,
                armutMiktari, elmaMiktari, domatesMiktari,muzMiktari, patlicanMiktari;
        Scanner input= new Scanner( System.in);

        System.out.print("Armut kaç kilo ? : ");
        armutMiktari = input.nextDouble();
        System.out.print("Elma kaç kilo ? :");
        elmaMiktari = input.nextDouble();
        System.out.print("Domates kaç kilo ? : ");
        domatesMiktari = input.nextDouble();
        System.out.print("Muz kaç kilo ? : ");
        muzMiktari = input.nextDouble();
        System.out.print("Patlıcan kaç kilo ? : ");
        patlicanMiktari = input.nextDouble();

        double toplamTutar;
        toplamTutar =(armutMiktari*armutKilosu)+(elmaMiktari*elmaKilosu)+(domatesMiktari*domatesKilosu)+
                (muzMiktari*muzKilosu)+(patlicanMiktari*patlicanKilosu);
        System.out.println("Toplam Tutar : " +toplamTutar);





    }
}
