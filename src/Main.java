public class Main {
    public static void main(String[] args){

        double sum=0;
        double avarage=0.0;

        int[] liste={4,3,5,6};

        for(int i :liste){
            sum+=i;
            avarage=sum/ liste.length;
        }
        System.out.print("Ortalama : "+avarage);
    }

    }