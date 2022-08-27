import java.util.Scanner;

public class daire {
    public static void main(String[] args) {

        double pi= 3.14, a,r,alan;

        Scanner input = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz : ");
        r = input.nextDouble();
        System.out.print("Dairenin açı değerini giriniz : ");
        a = input.nextDouble();

        alan= (pi*(r*r)*a)/360;
        System.out.println("Daire dilim alanı : "+ alan);


    }
}
