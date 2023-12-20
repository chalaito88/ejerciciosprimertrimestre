package cadenatexto;

import java.util.Scanner;

public class paresnumisimparesmayus {
    public static void main(String[] args) {
                /*Desarrolla un programa que solicite al usuario una cadena de caracteres. Recorre sus
        caracteres utilizando un bucle e imprime los caracteres impares en mayúscula y los pares en
        minúscula.*/

        Scanner lector = new Scanner(System.in);
        String introducidoUsuario = lector.next();

        for (int i = 0; i < introducidoUsuario.length();i++){
            if (i%2==0){
                String letrita = String.valueOf(introducidoUsuario.charAt(i));
                System.out.println(letrita.toUpperCase());
            }else {
                String letrita = String.valueOf(introducidoUsuario.charAt(i));
                System.out.println(letrita.toLowerCase());
            }
        }

    }
}
