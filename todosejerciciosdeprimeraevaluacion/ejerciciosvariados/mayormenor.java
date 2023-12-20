package ejerciciosvariados;

import java.util.Scanner;

public class mayormenor {
    public static void main(String[] args) {
        // Ejercicio 2: Algoritmo que lea dos números e indique cual es el mayor.
        int num1,num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        num1=sc.nextInt();
        System.out.println("Introduce otro numero: ");
        num2= sc.nextInt();
        if (num1>num2){
            System.out.println("El " + num1 + " es mayor a " + num2);
        } else {
            System.out.println("El " + num2 + " es mayor a " + num1);

        }
    }
}