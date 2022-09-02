import java.util.Scanner;
public class fibonacciSayisi {
        public static void main(String[] args) {
                int a = 0, b = 1, c = 0;
                Scanner scanner = new Scanner(System.in);
                System.out.print("Lütfen sayı fibonaci eleman sayısını giriniz: ");
                int x = scanner.nextInt();


                for (int i = 1; i <= x; i++) {
                        System.out.print(a + " ");

                        c = a + b;
                        a = b;
                        b = c;

                }
        }
}