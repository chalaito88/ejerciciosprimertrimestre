package ejerciciosvariados;

import java.util.Scanner;

public class recogeunnumeroymuestralo {
    public static void main(String[] args) {
        // - Ejercicio 1: Programa que lea un número, lo almacene y lo imprima por pantalla.
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = scan.nextInt();
        System.out.println(num);
    }
}