import java.util.Scanner;

public class sicaklikOnermesi {
    public static void main(String[] args) {
        int heat;
        Scanner input =new Scanner(System.in);
        System.out.println("Sıcaklık Derecesi Giriniz : ");
        heat=input.nextInt();

        if (heat <= 5) {
            System.out.println("Kayak yababilirsiniz. ");
        }
        else if ( heat>5 && heat<=15) {
            System.out.println("Sinemaya gidebilirsiniz. ");
        }
        else if ( heat>=15 && heat<=25) {
            System.out.println("Piknik gidebilirsiniz.");
        }
        else if ( heat>=25) {
            System.out.println("Yuzmeye gidebilirsiniz.");
        }
    }
}