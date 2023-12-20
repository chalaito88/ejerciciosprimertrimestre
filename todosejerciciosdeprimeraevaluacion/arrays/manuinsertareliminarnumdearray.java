package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class manuinsertareliminarnumdearray {
    static void enterContinuar () {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Presiona ENTER para continuar...");
        scan.nextLine();
    }
    /* Modifica el programa del ejercicio 1 para que admita además la operación de eliminación.
Los elementos del array tras la eliminación deben ser desplazados para evitar que existan huecos vacíos.*/
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        int array1[] = {1,5,7,5,6,1,5,58,4,60};
        int array2[] = new int[array1.length+1];
        int opt, num, posicion;

        do {
            System.out.println("Esta es la secuencia que tenemos: ");
            System.out.println(Arrays.toString(array1));
            System.out.println();
            enterContinuar();
            System.out.println("""
                 Que quieres hacer: 
                 1- Introducir un numero
                 2- Borrar un numero
                 0- Salir
                 """);
            System.out.println("Introduce un numero: ");
            opt = lector.nextInt();
            switch (opt){
                case 1:
                    System.out.println(Arrays.toString(array1));
                    System.out.println("Introduce el numero que quieres insertar");
                    num = lector.nextInt();
                    System.out.println("Introduce que posicion quieres meter el numero elegido: ");
                    posicion = lector.nextInt();

                    System.arraycopy(array1, 0, array2, 0, posicion+1);

                    System.arraycopy(array1, posicion, array2,posicion+1,array1.length-posicion);
                    array1[posicion-1] = num;
                    System.out.println(Arrays.toString(array1));
                    System.out.println(Arrays.toString(array2));
                    break;
                case 2:

                    break;
                case 0:
                    System.out.println("Saliendo del programa!!");
                    break;
                default:

                    break;
            }
        }while (opt !=0);
    }
}