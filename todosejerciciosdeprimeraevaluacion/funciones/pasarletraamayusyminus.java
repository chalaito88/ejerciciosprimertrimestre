package funciones;

import java.util.Scanner;

public class pasarletraamayusyminus {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce algo: ");
        char caracter = lector.next().charAt(0);


        if (Character.isLetter(caracter)){
            if (Character.isLowerCase(caracter)){
                System.out.println(Character.toUpperCase(caracter));
            } else {
                System.out.println(Character.toLowerCase(caracter));
            }
        } else if (Character.isDigit(caracter)) {
            System.out.println(Character.getNumericValue(caracter) * 3);
        } else {
            System.out.println((char) 169);
        }
    }
}