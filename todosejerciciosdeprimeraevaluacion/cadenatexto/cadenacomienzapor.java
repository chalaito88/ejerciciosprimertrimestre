package cadenatexto;
import java.util.Scanner;

public class cadenacomienzapor {
    public static void main(String[] args) {
        /*Escribe un programa que solicite al usuario dos cadenas de caracteres y compruebe si
        comienzan por los mismos 5 caracteres.*/
        Scanner lector = new Scanner(System.in);
        System.out.println(" Introduce algo por teclado.");
        String cad = lector.nextLine(), cad2 = lector.nextLine();

        System.out.println((cad.regionMatches(0,cad2,0,5)) ? " Si Coinciden los primeros 5 dígitos" : " No Coinciden los primeros 5 dígitos" );

    }
}