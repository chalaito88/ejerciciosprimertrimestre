package ejerciciosvariados;

import java.util.Scanner;

public class factorialnum {
    public static void main(String[] args) {
        //Ejercicio 2: Desarrolla un programa que calcule el factorial de un número solicitado al usuario.

        System.out.println("Introduce un numero para calcular su factorial: ");
        Scanner scan = new Scanner(System.in);
        int num, facto = 1, i;
        num = scan.nextInt();

        for (i = 1; i <= num; i++) {
            facto = facto * i;

        }
        System.out.println(facto);
    }
}
