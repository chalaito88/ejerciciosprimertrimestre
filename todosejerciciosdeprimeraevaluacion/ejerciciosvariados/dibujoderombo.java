package ejerciciosvariados;

import java.util.Scanner;

public class dibujoderombo {
    public static void main(String[] args) {
               Scanner scanner = new Scanner(System.in);
                System.out.print("Ingresa el número de filas del rombo (debe ser impar): ");
                int n = scanner.nextInt();

                if (n % 2 == 0) {
                    System.out.println("El número de filas debe ser impar.");
                } else {
                    dibujarRombo(n);
                }

                scanner.close();
            }

            public static void dibujarRombo(int n) {
                for (int i = 1; i <= n; i += 2) {
                    for (int j = 0; j < (n - i) / 2; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }

                for (int i = n - 2; i >= 1; i -= 2) {
                    for (int j = 0; j < (n - i) / 2; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }