package ejerciciosvariados;

import java.util.Scanner;

public class edadpromedio {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int edad, opera = 0 , edadTotal = 0, contador = 0;

        do {
            System.out.println("Introduce edades: ");
            edad = scan.nextInt();
            contador++;
            edadTotal = edadTotal + edad;
            opera = edadTotal / contador;

        } while (opera <= 25);
        System.out.println("El promedio de edad supero 25.");
        System.out.println("Tienes un promedio de : " + opera);
    }

}