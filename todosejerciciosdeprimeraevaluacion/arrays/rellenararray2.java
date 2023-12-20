package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class rellenararray2 {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        System.out.println("Como quieres de larga el Array?");
        int cuanto = lector.nextInt();
        int listnum[] = new int[cuanto], listnum2[] = new int[cuanto];
        for (int i = 0; i<cuanto;i++){
            System.out.println("Introduce un número: ");
            listnum[i] = lector.nextInt();
        }
        for (int i = cuanto-1, a = 0; i >= 0 ;i--, a++) {
            listnum2[a]= listnum[i];
        }
        System.out.println(Arrays.toString(listnum));
        System.out.println(Arrays.toString(listnum2));

    }
}