package cadenatexto;

import java.util.Scanner;

public class menucadenasdetexto {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        System.out.println("¿ Cuantas cadenas quiere ingresar?");
        int op, posicion = 0, numCadena = lector.nextInt();
        lector.nextLine();
        String[] listCadena = new String[numCadena];

        for (int i = 0; i < listCadena.length; i++) {
            System.out.println("Introduce lo que quieras almacenar");
            listCadena[i] = lector.nextLine();
        }

        System.out.println("""
                1- Búsqueda posición de carácter.
                                
                2- Búsqueda posición de un texto.
                                
                3- Buscar carácter desde el final.
                                
                4- Buscar texto.
                                
                5- Salir.
                                
                Introduce una opción:
                         
                """);
        op = lector.nextInt();

        do {
            switch (op) {

                case 1:

                    System.out.println("Que carácter quieres buscar: ");
                    char queBuscas = lector.next().charAt(0);
                    for (int i = 0; i < listCadena.length; i++) {

                        System.out.println(listCadena[i].indexOf(queBuscas));

                    }
                    break;
                case 2:

                    System.out.println("Que texto quieres buscar: ");
                    String queBuscas2 = lector.next();
                    for (int i = 0; i < listCadena.length; i++) {

                        System.out.println(listCadena[i].indexOf(queBuscas2));
                    }
                    break;
                case 3:
                    System.out.println("Que texto quieres buscar: ");
                    char queBuscas3 = lector.next().charAt(0);
                    for (int i = 0; i < listCadena.length; i++) {
                        System.out.println(listCadena[i].lastIndexOf(queBuscas3));
                    }
                    break;
                case 4:
                    System.out.println("Que texto quieres buscar: (empezar) ");
                    String queBuscas4 = lector.next();
                    System.out.println("Que texto quieres buscar: (final) ");
                    String queBuscas5 = lector.next();

                    for (int i = 0; i < listCadena.length; i++) {
                        System.out.println(listCadena[i].startsWith(queBuscas4));
                        System.out.println(listCadena[i].endsWith(queBuscas5));
                    }
                    break;
                case 5:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Introduzca un carácter valido.");
                    break;

            }
        }while (op != 5) ;
    }
}