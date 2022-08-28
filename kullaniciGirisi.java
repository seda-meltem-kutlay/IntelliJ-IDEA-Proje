import java.util.Scanner;

public class kullaniciGirisi {
    public static void main(String[] args) {
        String userName, password, sifreReset, yeniSifre;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adınız : ");
        userName = input.nextLine();
        System.out.print("Şifreniz : ");
        password = input.nextLine();
        if (userName.equals("patika") && password.equals("123patika")) {
            System.out.println("Giriş Yaptınız");
        } else {
            System.out.println("Şifreniz Hatalıdır. Yeni bir şifre oluşturmak istiyorsanız, " +
                    "evet ya da hayırı seçin");
            sifreReset = input.nextLine();
            if (sifreReset.equals("hayır")) {
                System.out.println("Giriş sonlandırıldı");
            } else if (sifreReset.equals("evet")) {
                System.out.println("Yeni şifrenizi girin");
                yeniSifre = input.nextLine();
                if (yeniSifre.equals("123patika") || yeniSifre.equals(password)) {
                    System.out.println("Eski şifrenizle yeni şifreniz aynı olamaz");
                } else {
                    System.out.println("Yeni şifre başarıyla oluşturuldu.");
                }
            } else {
                System.out.println("Şifreniz Hatalıdır.");
            }
        }
    }
}

