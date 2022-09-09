import java.util.Arrays;

public class HarmonikOrt {

    public static void main(String[] args ){

        double harmonikSira;
        double sum=0;
        double harmonikOrt=0.0;

        int[] liste={1,2,3};

        for(int i:liste){
            harmonikSira=1.0/i;
            sum+=harmonikSira;
            harmonikOrt= liste.length/sum;

        }
        System.out.println("Harmonik Ortalama: \t"+harmonikOrt);
    }
}
