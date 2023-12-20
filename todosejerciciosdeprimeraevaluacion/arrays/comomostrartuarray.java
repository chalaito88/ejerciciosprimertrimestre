package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class comomostrartuarray {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("Como quieres de larga el Array?");
        int cuanto = lector.nextInt();
        int listnum[] = new int[cuanto];
        for (int i = 0; i<cuanto;i++){
            System.out.println("Introduce un número: ");
            listnum[i] = lector.nextInt();
        }
        System.out.println(Arrays.toString(listnum));
    }
}