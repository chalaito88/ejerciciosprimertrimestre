package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arraydemilbusquedacoincidencia {
    public static void main(String[] args) {
        int arraydemil [] = new int[1000];

        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el numero que quieres comprobar");
        int num = lector.nextInt();

        for (int i = 0; i < 1000; i++) {
            arraydemil[i] = (int)(Math.random()*100+1);
        }
        int veces = 0;
        for (int i = 0; i < 1000; i++) {
            if (arraydemil[i] == num) {
                veces++;
            }
        }
        int arrayindices[] = new int[veces];
        int coinci = 0;
        //System.out.println(Arrays.toString(arraydemil));
        for (int i=0;i<1000;i++) {
            if (arraydemil[i] == num) {
                arrayindices[coinci] = i;
                coinci++;
            }
        }
        System.out.println(Arrays.toString(arrayindices));
        System.out.println("El primer conincidencia es: " + arrayindices[0]);
        System.out.println("La ultima coincidencia es: " + arrayindices[coinci-1]);
    }
}