import java.io.FileDescriptor;
import java.util.Scanner;

public class usluSayiHesaplayanProgram {
    public static void main(String[] args ){
        int n,k,total=1;
        Scanner inp=new Scanner(System.in);
        System.out.print("Üssü alıncak sayı: ");
        n=inp.nextInt();
        System.out.print("Üs olcak sayı: ");
        k=inp.nextInt();

        {
            for(int i= 1; i<=k; i++ ) {
                total*=n;
            }
        System.out.println("Cevap "+total);
    }
    }}

