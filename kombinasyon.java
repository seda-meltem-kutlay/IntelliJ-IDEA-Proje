import java.util.Scanner;
public class kombinasyon{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1,number2,nFactorial=1,rFactorial=1,sub,xFactorial=1,combination;
        System.out.println("Combination = C(n,r). Enter number as 'n': ");
        number1 = scanner.nextInt();
        System.out.println("And the number as 'r': ");
        number2 = scanner.nextInt();
        for(int i=1; i<=number1;i++) {nFactorial*=i;}
        for(int i=1;i<=number2;i++) {rFactorial*=i;}
        sub=number1-number2;
        for(int i=1;i<=sub;i++){xFactorial*=i;}
        combination=nFactorial/(rFactorial*xFactorial);
        System.out.println("C(" + number1 + "," + number2 + ")= " + combination);
    }
}
