package ejerciciosvariados;

import java.util.Scanner;

public class menuopcionesvarias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean bule=true;
        while (bule) {
            System.out.println("------------------------------");
            System.out.println("1 - Cuenta pares e impares");
            System.out.println("2 - Estadisticas");
            System.out.println("3 - Fibonacci");
            System.out.println("------------------------------");
            System.out.println("Introduce una opcion: ");
            int opt = scan.nextInt();

            switch (opt) {
                case 1: {
                    // Cuenta Pares e Impares: Solicitaremos un número al usuario e indicaremos el número de cifras
                    // totales del número, el número de cifras pares y el número de cifras impares. Por ejemplo,
                    // si introduce el número 13502 indicaremos que tiene 5 dígitos de los cuales 3 son impares
                    // y 2 son pares.
                    System.out.println("Introduce un numero: ");
                    int num = scan.nextInt();
                    int unidades,decenas,centenas,millares,decenaDeMillar,centenaDeMillar;
                    unidades=num%10;
                    decenas=(num/10)%10;
                    centenas=(num/100)%10;
                    millares=(num/1000)%10;
                    decenaDeMillar=(num/10000)%10;
                    centenaDeMillar=(num/100000)%10;

                }
                case 2: {
                    //Estadísticas: Preguntaremos al usuario cuántos números va a introducir. Solicitaremos
                    // esos números, y como resultado imprimiremos el mayor, el menor y la media aritmética.
                    int repe = 0, num;




                }
                case 3: {
                    //Fibonacci: La sucesión de Fibonacci es una sucesión infinita de números naturales
                    // como la siguiente:
                    int num1, num2, repe = 0, acumu;
                    System.out.println("Introduce el primer numero: ");
                    num1= scan.nextInt();
                    System.out.println("Introduce el segundo numero: ");
                    num2= scan.nextInt();
                    System.out.println("Introduce cuanto de la serie de Fibonacci: ");
                    repe= scan.nextInt();
                    for (int i =0; i<=repe;i++) {
                        num2=num1+num2;
                    }

                }

            }

        }

    }
}