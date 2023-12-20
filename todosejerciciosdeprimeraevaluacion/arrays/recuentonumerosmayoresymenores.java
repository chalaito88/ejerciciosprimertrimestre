package arrays;

import java.util.Arrays;

public class recuentonumerosmayoresymenores {
    public static void main(String[] args) {
        int arraydecien[] = new int[100];

        for (int i = 0 ; i< 100; i++) {
            arraydecien[i] = (int)(Math.random()*100+1);
        }
        //System.out.println(Arrays.toString(arraydecien));
        int arraymenores[] = new int [50], arraymayores[] = new int[50];

        arraymenores = Arrays.copyOfRange(arraydecien,0,50);
        arraymayores = Arrays.copyOfRange(arraydecien,50,100);
        System.out.println(Arrays.toString(arraymenores));
        System.out.println(Arrays.toString(arraymayores));


    }
}