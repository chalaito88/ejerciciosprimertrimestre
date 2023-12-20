package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class copiaarraysinfuncion {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce 5 caracteres");
        char cincocaracteres[] = new char[5], cincocaracterescopi[]= new char[5];


        for (int i =0 ; i < cincocaracteres.length;i++) {
            cincocaracteres[i] = lector.next().charAt(0);
        }

        for (int i =0 ; i < cincocaracteres.length;i++) {
            cincocaracterescopi[i] = cincocaracteres[i];
        }
        System.out.println(Arrays.toString(cincocaracteres));
        System.out.println(Arrays.toString(cincocaracterescopi));

    }
}