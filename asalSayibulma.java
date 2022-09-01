import java.util.Scanner;
public class asalSayibulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int a=1;a<=100;a++) {
            int kont=0;
            for (int i = 1; i <= a; i++) {
                if ( a % i == 0) {
                    kont++;
                }
            }
            if(kont==2){
                System.out.print(a+" ");
            }
        }
    }
}