package ejerciciosvariados;

import java.util.Scanner;

public class ejercicioentornosdedesarollo {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int cod,uni,total = 0;
        boolean siono = true;

        do {
            System.out.println("Si quieres salir del programa en el código pon un 0");
            System.out.println("Introduce el código de artículo: ");
            cod = lector.nextInt();
            if (cod == 0) {
                siono = false;
            }else {
                System.out.println("Introduce Las unidades que quieras: ");
                uni = lector.nextInt();
                System.out.println("Introduce el precio: ");
                total = lector.nextInt();

                //Opera
                total =+ (total*uni);
            }
            System.out.println("El precio total es: " + total);
        } while (siono);

    }
}