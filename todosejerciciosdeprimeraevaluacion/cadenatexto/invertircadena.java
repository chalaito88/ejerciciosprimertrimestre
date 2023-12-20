package cadenatexto;

import java.util.Scanner;

public class invertircadena {
    public static void main(String[] args) {
                /*Escribe un programa que solicite al usuario una cadena de caracteres e imprímela
        invertida. */
        Scanner lector = new Scanner(System.in);
        String introducidoUsuario = lector.next();

        for (int i = introducidoUsuario.length() -1; i <= 0; i--){
            System.out.println(introducidoUsuario.charAt(i));
        }
    }
}