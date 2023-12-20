package arrays;

import java.util.Scanner;

public class creacionarraymultidimensional {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int filas, columnas;

        System.out.println("Cuantas filas quieres? ");
        filas = lector.nextInt();
        System.out.println("Cuantas columnas quieres?");
        columnas = lector.nextInt();

        int arraymulti [] [] = new int[filas][columnas];

        for (int i = 0; i<filas; i++) {
            for (int j =0; j<columnas; j++){
                System.out.println("Que numero quieres introducir? ");
                arraymulti [i] [j] = lector.nextInt();
            }
        }
        for (int i = 0; i<filas; i++) {
            for (int j =0; j<columnas; j++){
                System.out.print(arraymulti[i] [j] + " ");
            }
            System.out.println();
        }

    }
}