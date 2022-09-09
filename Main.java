import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] list = {-12, -10, 50, 5, 1111, 11};
        Arrays.sort(list);
        System.out.println("sıralama");
        System.out.println(Arrays.toString(list));

        Scanner input = new Scanner(System.in);
        System.out.print("Değer: ");
        int sayi = input.nextInt();

        for (int i = 0; i < list.length; i++){

            if (sayi < list[i]){
                System.out.println("Girilen sayıdan büyük ilk sayı: " + list[i]);
                System.out.println("Girilen sayıdan küçük ilk sayı: " + list[i-1]);
                break;
            }


        }
    }
}