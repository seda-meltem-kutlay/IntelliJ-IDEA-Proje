import java.util.Scanner;
public class recursiveusAlma {

    static int us(int a, int b){
        if(a==1| b==0)
            return 1;
        return us(a,b-1)*a;

    }
    public static void main(String[] args ){
        Scanner scan= new Scanner(System.in);
        System.out.print("1. sayıyı girin : ");
        int a =scan.nextInt();
        System.out.print("2. sayıyı girin : ");
        int b=scan.nextInt();

        System.out.println("Sonuç : "+ us(a,b));

    }
}