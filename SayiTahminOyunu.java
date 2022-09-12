import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Random rastgele = new Random();
        int number = rastgele.nextInt(100);
        number = (int) (Math.random() * 100);

        Scanner input = new Scanner(System.in);
        int right = 0;
        int select;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;


        System.out.println(number);
        while (right < 5) {
            System.out.print("Tahmininizi girin : ");
            select = input.nextInt();

            if (select < 0 || select > 99) {
                System.out.println("0 ile 100 arasında bir değer giriniz : ");
                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalı değer girdiniz. Kalan hakkınız " + (5 - right));

                } else {
                    isWrong = true;
                    System.out.println("Bir dahaki hatalı değer girişinizde hakkınız azalacaktır.");
                }
                continue;
            }
            if (select == number) {
                System.out.println("Tebrikler, girdiğiniz değer gizli sayı ile aynıdır.Gizli sayı : " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Hatalı değer girdiniz.");
                if (select > number) {
                    System.out.println(select + "\tsayısı gizli sayıdan büyüktür.");
                } else {
                    System.out.println(select + "\tsayısı gizli sayıdan küçüktür.");
                }
                wrong[right++] = select;
                System.out.println("Kalan hak : " + (5 - right));
            }
        }
        if (!isWin) {
            System.out.println("Kaybettiniz.");
            if (!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            }

        }

    }
}
