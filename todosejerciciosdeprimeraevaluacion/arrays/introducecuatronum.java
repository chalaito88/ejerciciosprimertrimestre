package arrays;

import java.util.Scanner;

public class introducecuatronum {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        double arrayNum [] = new double[4];


        for (int i =0; i<4;i++) {
            System.out.println("Introduce 4 numeros: ");
            arrayNum[i] = lector.nextDouble();
        }

        System.out.println("Tenemos estos datos: " + " " + arrayNum[0] + " " + arrayNum[1] + " " + arrayNum[2] + " " +
                arrayNum[3]);
        System.out.println("Despues de operar son: ");
        System.out.println(arrayNum[0] * arrayNum[1]);
        System.out.println(arrayNum[1] * arrayNum[2]);
        System.out.println(arrayNum[2] * arrayNum[3]);
        System.out.println(arrayNum[3] * arrayNum[0]);
    }
}
