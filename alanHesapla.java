import java.util.Scanner;

public class alanHesapla {
    public static void main(String[] args) {
        int a,b, alan;

        Scanner girdi = new Scanner(System.in);
        System.out.print("1. kenarı giriniz : ");
        a = girdi.nextInt();
        System.out.print("2. kenarı giriniz : ");
        b = girdi.nextInt();


        System.out.println("Üçgenin alanı : "+ (a*b)/2);
        alan = girdi.nextInt();


    }


}
