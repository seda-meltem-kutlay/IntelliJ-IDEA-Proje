import java.util.Scanner;
public class atmProjesi {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Kullanıcı adınız : ");
            userName = input.nextLine();
            System.out.print("Şifreniz : ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba. Bankaya giriş yaptınız.");
                do {
                    System.out.println("1- Para yatırma\n" + "2- Paraçekme\n" +
                            "3- Bakiye sorgulama\n" + "4- Çıkış yap ");
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçin. ");
                    select = input.nextInt();
                    if (select == 1) {
                        System.out.print("Para miktarı :");
                        int price = input.nextInt();
                        balance += price;

                    } else if (select == 2) {
                        System.out.println("Para miktarı : ");
                        int price = input.nextInt();
                        if (price > balance) {
                            System.out.println("Bakiye yetersiz. ");
                        } else {
                            balance -= price;

                        }
                    } else if (select == 3) {
                        System.out.println("Bakiyeniz : " + balance);
                    }
                }
                while (select != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;

            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur.Müşteri hizmetleriyle iletişim geçiniz.");
                } else {
                    System.out.println("Kalan hakkınız: " + right);
                }
            }
        }
    }
}


