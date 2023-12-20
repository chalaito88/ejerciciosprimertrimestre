package funciones;

import java.util.Scanner;

public class numeroastring {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if (num <=5 && num >=0) {
            System.out.println(numeros(num));
        } else {
            System.out.println("Introduce un numero entre 0 y 5");
        }
        numeros("hola");

    }
    static String numeros (int num) {
        String numerito = " ";
        switch (num){

            case 0:
                numerito = "CERO";
                break;
            case 1:
                numerito = "UNO";
                break;
            case 2:
                numerito = "DOS";
                break;
            case 3:
                numerito = "TRES";
                break;
            case 4:
                numerito = "CUATRO";
                break;
            case 5:
                numerito = "CINCO";
                break;
        }
        return numerito;
    }
    static String numeros (String cositas) {
        System.out.println(cositas.toUpperCase());
        return cositas;
    }
}