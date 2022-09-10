import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("matris satırı : ");
        int lenght = scan.nextInt();
        System.out.print("matris sütunu : ");
        int boy = scan.nextInt();
        System.out.println("matris elemanlarını girin : ");

        int[][] matris = new int[lenght][boy];

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++)
                matris[i][j] = scan.nextInt();

        }
        System.out.println("========");
        System.out.println("matris : ");
        System.out.println(" ");

        for (int i = 0; i < matris.length; i++) {
            for (int j = 0; j < matris[i].length; j++)
                System.out.print(matris[i][j] + "   ");
            System.out.println();
        }
        System.out.println("---------");
        System.out.println("matrisin transpozu : ");
        System.out.println();
        for (int j = 0; j < matris[0].length; j++) {
            for (int i = 0; i < matris.length; i++) {
                System.out.print(matris[i][j] + "   ");
            }
            System.out.println();
        }
        scan.close();

    }
}