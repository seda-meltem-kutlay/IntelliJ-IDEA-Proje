import java.util.Random;
import java.util.Scanner;

public class mineSweeper {

    Scanner scan = new Scanner(System.in);
    Random rand = new Random();
    int rowNumber, colNumber;
    String[][] map;
    int[][] board;
    int mayinSayisi;

   mineSweeper(int rowNumber, int colNumber) {
        this.rowNumber = rowNumber;
        this.colNumber = colNumber;
        this.map = new String[rowNumber][colNumber];
        this.board = new int[rowNumber][colNumber];
        this.mayinSayisi = (rowNumber * colNumber) / 4;

    }

    public void run() {
        int dogru = 0;
        oyunuHazirla();
        System.out.println("--------------");
        while (true) {
            printMap(board);
            System.out.print("satır gir: ");
            int satir = scan.nextInt();
            System.out.print("sütun gir: ");
            int sutun = scan.nextInt();
            if (map[satir][sutun] != "*") {
                check(satir, sutun);
                dogru++;
                if (dogru == (mayinSayisi * 4 - mayinSayisi)) {
                    System.out.println("Tebrikler Oyunu Kazandınız ");
                    break;
                }
            } else {
                System.out.println("Kaybettiniz.");
                break;
            }

        }
    }

    public void check(int r, int c) {
        if (map[r][c] == "-") {
            if ((c < colNumber - 1) && map[r][c + 1] == "*") {
                board[r][c]++;
            }
            if ((r < rowNumber - 1) && map[r + 1][c] == "*") {
                board[r][c]++;
            }
            if (r > 0 && map[r - 1][c] == "*") {
                board[r][c]++;
            }
            if (c > 0 && map[r][c - 1] == "*") {
                board[r][c]++;
            }

            if (board[r][c] == 0) {
                board[r][c] = -2;
            }

        }

    }

    public void oyunuHazirla() {
        int row, col;
        int say = 0;

        while (say < mayinSayisi) {
            row = rand.nextInt(rowNumber);
            col = rand.nextInt(colNumber);
            if (map[row][col] != "*") {
                map[row][col] = "*";
                say++;
            }
        }
        int i, j;
        for (i = 0; i < map.length; i++) {
            for (j = 0; j < map[i].length; j++) {
                if (map[i][j] != "*") {
                    map[i][j] = "-";

                }
                System.out.print(map[i][j] + " ");
            }
            System.out.println();

        }

    }

    public void printMap(int[][] arr) {
        int i, j;
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
    }
}