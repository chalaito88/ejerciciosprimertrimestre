package ejerciciosvariados;

import java.util.Scanner;

public class cuentatres2en2 {
    public static void main(String[] args) {
        // Ejercicio 4: Realiza un programa que realice la cuenta atrás de dos en dos a partir de un número
        //introducido por el usuario. El programa debe finalizar cuando llegue al 0.

        int num;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un numero para la cuenta atras: ");
        num = scan.nextInt();

        for (int i = num; i >= 0; i -= 2) {
            System.out.println(i);
        }


    }
}

