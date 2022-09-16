import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.print("Satır sayısını gir : ");
        int satir = scan.nextInt();
        System.out.print("Sütun sayısını gir : ");
        int sutun = scan.nextInt();
        mineSweeper m = new mineSweeper(satir, sutun);
        m.run();
        scan.close();

    }
}