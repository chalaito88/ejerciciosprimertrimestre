package cadenatexto;

import java.util.Scanner;

public class codificaydescodifica {
    public static void main(String[] args) {
        /* Desarrolla un programa que realice la codificación y decodificación de un texto,
        cumpliendo las siguientes requisitos:
        ▪ El texto a procesar será solicitado al usuario.
        ▪ Cada palabra se mostrará en orden inverso. Ej: hola mundo → mundo hola.
        ▪ Las letras mayúsculas serán sustituidas por la letra minúscula anterior. Ej: A → b.
        ▪ Las letras minúsculas serán sustituidas por la letra mayúscula posterior. Ej: b → C.
        ▪ Los dígitos se incrementaran en 3 unidades. Ej: 5 → 8. 9 → 2.
        ▪ Los espacios se sustituirán por *.
        Crea un método para codificar, otro para decodificar y pruébalo con diferentes textos.*/

    Scanner lector = new Scanner(System.in);

        System.out.println("Intruduce tu texto: ");
    String textito = lector.next();


}
    static void codificacion (String[] textito){

        for (int i = textito.length; i >= 0; i-- ) {

        }


    }
    static  void  decodificacion ( String[] textito) {



    }
}