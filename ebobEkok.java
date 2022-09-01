import java.util.Scanner;
public class ebobEkok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ebob=0, ekok;
        System.out.println("n1  ve n2 sayısını girin : ");
        int n1=sc.nextInt();
        int n2=sc.nextInt();

        int i=1;
        while(i<=n2){
            if (n1%i==0&&n2%i==0){
                ebob=i;
            }
            i++;
        }
        ekok=(n1*n2)/ebob;
        System.out.println("Sayıların ebobu = " +ebob + "\nSayıların ekoku = "+ ekok);
    }
}