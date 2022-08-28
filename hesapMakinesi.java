import java.util.Scanner;
public class hesapMakinesi {
    public static void main(String[] args ){
        int number1,number2,select;
        Scanner input=new Scanner( System.in);
        System.out.print("İlk sayıyı girin :");
        number1= input.nextInt();
        System.out.print("2. sayıyı girin :");
        number2= input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çaprma\n4-Bölme");
        System.out.println("Seçiminiz :");
        select= input.nextInt();
        switch(select){
            case 1:
                int toplam= number1+number2;
                System.out.println("Toplam: "+toplam);
                break;
            case 2:
                int cikarma=number1-number2;
                System.out.println("Çıkarma : "+cikarma);
                break;
            case 3:
                int carpma=number1*number2;
                System.out.println("Çarpma : "+carpma);
                break;
            case 4:
                int bolme=number1/number2;
                System.out.println("Bölme : "+bolme);
                break;
            default:
                System.out.println("Geçerli bir işlem girin.");


        }
    }
}
