package arrays;

import java.util.Scanner;
import java.util.Arrays;

public class rellenararray {
    public static void main(String[] args) {

    Scanner lector = new Scanner(System.in);

        System.out.println("Como quieres de larga el Array?");
    int cuanto = lector.nextInt();
    int listnum[] = new int[cuanto];
        Arrays.fill(listnum, cuanto);


        System.out.println(Arrays.toString(listnum));
    }
}
