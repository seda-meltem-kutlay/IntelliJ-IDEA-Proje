import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] seri = {9, 8, 87, 78, 78, 6, 6, 56, 5, 54, 3, 44, 55, 44, 2, 44, 67, 76, 9, 9};
        int[] frekans = new int[seri.length];

        for (int i = 0; i < seri.length; i++)
            frekans[i] = 1;

        for (int i = 0; i < seri.length; i++) {
            for (int j = 0; j < seri.length; j++) {
                if ((i != j) && (seri[i] == seri[j])) {
                    frekans[i]++;


                }
            }
                for (int j = 0; j < seri.length; j++) {
                    if ((i != j) && (seri[i] == seri[j])) {
                        seri[j] = 0;
                    }
                }
            }
            System.out.println(Arrays.toString(seri));
            for (int i = 0; i < seri.length; i++) {
                if (frekans[i] > 1) {
                    if (seri[i] != 0)
                        System.out.println(seri[i] + "\tsayısı\t" +  frekans[i] + "  kere tekrarlandı.");
                }
            }

        }
    }