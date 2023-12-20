package ejerciciosvariados;

import java.util.Scanner;

public class pasarcharmayusculasinfuncion {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        char caracter = lector.next().charAt(0);
        if (caracter >= 61 && caracter <= 'z'){
            caracter-=32;
        }else {
            System.out.println("Introduce una LETRA!!!");
        }
        System.out.println((char) caracter);
    }
}