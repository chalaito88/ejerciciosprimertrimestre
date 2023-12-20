package cadenatexto;

import java.util.Scanner;

public class introduceintystringyconcatena {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int[] arraynum = new int[10];
        char[] arraychar = new char[10];
        String cadenaFinal = "";

        for (int i = 0 ; i < 10; i++){
            System.out.println(" Introduce un numero: ");
            arraynum[i] = lector.nextInt();
        }
        for (int i = 0 ; i < 10; i++){
            System.out.println(" Introduce un carácter: ");
            arraychar[i] = lector.next().charAt(0);
        }
        for (int i = 0; i < arraychar.length;i++){
            cadenaFinal += arraynum[i];
            cadenaFinal += arraychar[i];
        }
        System.out.println(cadenaFinal);
    }
}