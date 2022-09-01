import java.util.Scanner;

public class basamakBulma {
    public static void main(String[] args ) {
        int num, total = 0, adet = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı değeri giriniz: ");
        num=input.nextInt();

        while(num !=0){
            total+=(num%10);
            num/=10;
            adet++;
        }
        System.out.println("Basamak Sayısı: "+adet);
        System.out.println("Basamak Toplamı: "+total);
    }
}