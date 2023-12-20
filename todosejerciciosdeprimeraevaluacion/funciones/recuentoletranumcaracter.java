package funciones;

import java.util.Scanner;

public class recuentoletranumcaracter {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        int caracter = 0,cuantos = 0,letras=0,numeros=0,caracteres=0;
        cuantos = lector.nextInt();
        char miArray [] = new char[cuantos];

        for (int i =0; i<miArray.length;i++){
            miArray[i]= lector.next().charAt(0);
        }

        for (int i =0; i<miArray.length;i++) {

            if (Character.isLetter(caracter)){
                letras++;
            } else if (Character.isDigit(caracter)) {
                numeros++;
            } else {
                caracteres++;
            }
        }
        System.out.println(letras);
        System.out.println(numeros);
        System.out.println(caracteres);
    }
}