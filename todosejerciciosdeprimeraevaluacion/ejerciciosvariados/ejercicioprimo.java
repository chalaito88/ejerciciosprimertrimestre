package ejerciciosvariados;

import java.util.Scanner;

public class ejercicioprimo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt(), i = 2, x=0;
        boolean primo = true;
        scan.close();
        while (i < num) {
            if (num % i == 0) {
                primo = false;
            }
            i++;
        }
        System.out.println("El número" + " " +(primo ? " " : "No") + " "  + "es primo");
    }
}
