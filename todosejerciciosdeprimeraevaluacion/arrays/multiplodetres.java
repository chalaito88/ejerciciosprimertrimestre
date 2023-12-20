package arrays;

import java.util.Scanner;

public class multiplodetres {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int arrayNum [] = new int[5];
        int intinera,contador = 0;

        while (contador < 5){
            System.out.println("Introduce un numero: ");
            int num = lector.nextInt();

            if (num %3 == 0) {

                for (intinera=0;intinera<5;intinera++){
                    arrayNum[intinera] = num;
                }
                contador++;
                System.out.println("Muy bien!! ya tenemos: " + contador);
            }
        }
        System.out.println(" " + arrayNum[0] + " " + arrayNum[1] + " " + arrayNum[2] + " " + arrayNum[3] + " " + arrayNum[4]);
    }
}