package ejerciciosvariados;

import java.util.Scanner;

public class potencianum {
    public static void main(String[] args) {
        //Realiza un programa que calcule la potencia de un número. Solicitará al usuario la base
        //y el exponente y realizará el cálculo. No se puede utilizar el método Math.pow().

        Scanner scan = new Scanner(System.in);

        int num, exponente = 1, i, resul = 1;
        System.out.println("Introduce el numero:");
        num = scan.nextInt();
        System.out.println("Introduce el exponente: ");
        exponente = scan.nextInt();

        for (i = 1; i < exponente; i++ ) {
            resul = resul * num;
        }
        System.out.println("El resultado es: " + resul);
    }
}
