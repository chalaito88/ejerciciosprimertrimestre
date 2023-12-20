package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arraydemilbusquedabinaria {
    public static void main(String[] args) {
        int arraydemil[] = new int[1000];
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el numero que quieres comprobar 0 al 100: ");
        int num = lector.nextInt();

        for (int i = 0; i < 1000; i++) {
            arraydemil[i] = (int)(Math.random()*100+1);
        }
        Arrays.sort(arraydemil);
        System.out.println(Arrays.toString(arraydemil));
        System.out.println(Arrays.binarySearch(arraydemil, num));

    }
}