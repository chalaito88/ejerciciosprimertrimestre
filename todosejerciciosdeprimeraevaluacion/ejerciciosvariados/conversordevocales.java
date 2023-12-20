package ejerciciosvariados;

import java.util.Scanner;

public class conversordevocales {
    public static void main(String[] args) {
        /* Escribir un programa que solicite una vocal al usuario y la muestre por pantalla convertida a
        *  mayúscula. El programa solicitará vocales al usuario hasta que introduzca dos vocales iguales consecutivas. Si el
        *  usuario introduce una consonante, el programa no realizará ninguna conversión y volverá a solicitar una vocal al
        *  usuario.
        */

        Scanner scan = new Scanner(System.in);
        char vocal, vocal2 = ' ';
        boolean repi = true;
        do {
            System.out.println("Introduce una vocal: ");
            vocal = scan.next().charAt(0);
            if (vocal == 'a') {
                System.out.println("A");
            } else if (vocal == 'e') {
                System.out.println("E");
            } else if (vocal == 'i') {
                System.out.println("I");
            } else if (vocal == 'o') {
                System.out.println("O");
            } else if (vocal == 'u') {
                System.out.println("U");
            }else {
                System.out.println("Es una consonante o un numero asique ");
            }
            if (vocal2 == vocal) {
                repi = false;
            }
            vocal2=vocal;
        } while (repi);
    }
}