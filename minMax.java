import java.util.Scanner;
public class minMax {
    public static void main(String[] args) {
        int sayi, girdi,max=1,min = 1;
        Scanner input =new Scanner(System.in);
        System.out.println("Kaç tane değer gireceğinizi belirtin : ");
        sayi=input.nextInt();
        for(int i =1; i <=sayi ; i++){
            System.out.println(i+ ".sayısını girin.");
            girdi=input.nextInt();
            if(i ==1) {
                max = girdi;
                min = girdi;
            }else{
                if(girdi>max){
                    max=girdi;
                    
                } else if (girdi<min) {
                    min=girdi;
                    
                }
            }
        }
        System.out.println("En büyük sayı: "+max);
        System.out.println("En küçük sayı: "+min);
    }
}
