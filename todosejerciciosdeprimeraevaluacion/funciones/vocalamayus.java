package funciones;

import java.util.Scanner;

public class vocalamayus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introducir un caracter: ");
        char caracter=scan.next().charAt(0);
        scan.close();
        mayus(caracter);



    }
    static void mayus (char caracter) {
        if (caracter =='a' || caracter =='e' || caracter == 'i' || caracter=='o' || caracter =='u') {
            switch (caracter){
                case 'a': System.out.println('A');
                    break;
                case 'e': System.out.println('E');
                    break;
                case 'i': System.out.println('I');
                    break;
                case 'o': System.out.println('O');
                    break;
                case 'u': System.out.println('U');
            }
        } else {
            System.out.println("ERROR FATAL || Tienes que introducir una letra.");
        }
    }
}