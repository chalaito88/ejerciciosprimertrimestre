package ejerciciosvariados;

import java.util.Scanner;

public class sumatoriocontenidonumero {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        int num = scan.nextInt(), suma=0;

        for (int i = 0; i <= num; i++) {
            suma += i;
        }
        System.out.println(suma);
    }
}