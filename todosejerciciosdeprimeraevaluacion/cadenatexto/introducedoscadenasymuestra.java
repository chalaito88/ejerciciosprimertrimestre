package cadenatexto;

import java.util.Scanner;

public class introducedoscadenasymuestra {
    public static void main(String[] args) {
        /* - Ejercicio 2: Programa que pida dos cadenas de texto al usuario y las imprima concatenadas.*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce una palabra");
        String palabra1 =scan.next();
        System.out.println("Introduce una palabra");
        String palabra2 = scan.next();
        System.out.println(palabra1 + " " +  palabra2);
    }
}