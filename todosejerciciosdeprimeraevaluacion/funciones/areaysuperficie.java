package funciones;

import java.util.Scanner;

public class areaysuperficie {
    public static void main(String[] args) {
        int opt=555,radio;
        boolean sino=true;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Introduce el numero del Radio: ");
            radio = scan.nextInt();
            System.out.println("------------------------------");
            System.out.println("1 - Calculame la superficie");
            System.out.println("2 - Calculame el volumen");
            System.out.println("0 - Salir");
            System.out.println("------------------------------");
            opt = scan.nextInt();

            switch (opt) {
                case 1: sino = true;
                    break;
                case 2: sino = false;
                    break;
                case 0: break;
                default: System.out.println("Introduce una opcion valida!!(1,2,0)");
            }
            System.out.println(calculoEsferico(radio, sino));
        } while (opt !=0);
    }
    static double calculoEsferico (int radio, boolean sino) {
        double resul;
        if (sino==false) {
            resul = ((4*Math.PI)/3)*(radio*radio*radio);
        } else {
            resul = (4*Math.PI)*(radio*2);
        }
        return resul;
    }
}