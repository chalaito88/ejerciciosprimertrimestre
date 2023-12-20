package arrays;

import java.util.Scanner;
import java.util.Arrays;

public class buscarnumenunaarray {
    public static void main(String[] args) {
        //Crea un programa que contenga un array inicial de números, de longitud 10. Solicita al
        //usuario un número y una posición, realiza la inserción del número en la posición indicada por el usuario.
        //El resto de elementos del array se deben desplazar tras la inserción.
        Scanner lector = new Scanner(System.in);

        int array1[] = {1,5,7,5,6,1,5,58,4,60};
        int array2[] = new int[array1.length+1];
        System.out.println(Arrays.toString(array1));
        System.out.println("Introduce el numero que quieres insertar");
        int num = lector.nextInt();
        System.out.println("Introduce que posicion quieres meter el numero elegido: ");
        int posicion = lector.nextInt();

        System.arraycopy(array1, 0, array2, 0, posicion+1);
        System.arraycopy(array1, posicion, array2,posicion+1,array1.length-posicion);
        array2[posicion-1] = num;
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}