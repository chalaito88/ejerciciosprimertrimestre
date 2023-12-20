package ejerciciosvariados;

import java.util.Scanner;

public class introducenumeroenteroynumerorealysuma {
    public static void main(String[] args) {

        /* - Ejercicio 3: Programa que lea dos números (uno de tipo entero y otro real) y muestre la suma.*/

        Scanner scan = new Scanner(System.in);
        //Variables
        int num1;
        double num2;

        System.out.println("Introduce un numero entero: ");
        num1 = scan.nextInt();
        System.out.println("Introduce un numero entero: ");
        num2 = scan.nextDouble();

        System.out.println("La suma de los dos numeros es: " + (num1+num2));

    }
}