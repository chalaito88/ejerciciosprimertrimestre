package arrays;

import java.util.Arrays;

public class arraydecienparimpar {
    public static void main(String[] args) {
        int[] arraydecien = new int[100];
        int contpar = 0,contimpar = 0;

        for (int i = 0 ; i< 100; i++) {
            arraydecien[i] = (int)(Math.random()*1000+1);
        }
        System.out.println("Array principal: " + Arrays.toString(arraydecien));

        //Variables para hacer los Array secundarios
        for (int i = 0; i<100; i++) {

            if (arraydecien[i] %2 == 0) {
                contpar++;
            }else {
                contimpar++;
            }
        }

        //Creacion de los arreglos necesarios y variables necesarias para guardar en las arrays
        int arraypar[] = new int[contpar], arrayimpar[] = new int[contimpar];
        int j=0,k=0;

        //Recorriendo el array de 100 numeros y guardandolo en los arrays secundarios
        for (int i = 0; i<100; i++) {

            if (arraydecien[i] %2 == 0) {
                arraypar[j] = arraydecien[i];
                j++;
            }else {
                arrayimpar[k] = arraydecien[i];
                k++;
            }
        }

        System.out.println("Array de números pares: " + Arrays.toString(arraypar));
        System.out.println("Array de números impares: " + Arrays.toString(arrayimpar));
    }
}