package funciones;

import java.util.Scanner;

public class P3EJ1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opt;

        do {
            System.out.println();
            System.out.println("""
                    --------------------------------------------
                    1 - Numeros primos.
                    2 - Cuenta atrás.
                    3 - Suma.
                    0 - Salir.             \s
                    --------------------------------------------
                    """);
            opt= scan.nextInt();

            switch (opt) {
                case 1:
                    int cuantas;
                    System.out.println("Introduce los numeros primos que quieres mostrar");
                    cuantas = scan.nextInt();
                    System.out.println("Los primeros "+ cuantas + " numeros primos son: ");
                    for (int i = 2, contador = 0; contador < cuantas; i++) {
                        if (numerosPrimos(i)) {
                            System.out.print(i + " ");
                            contador++;
                        }
                    }
                    enterContinuar();
                    break;

                case 2:
                    int num1,num2,opt2;
                    float num3;
                    System.out.println("""
                            1 - Cuenta atrás de un numero a 0.
                            2 - Cuenta atrás del numero mayor al menor.
                            3 - Cuenta atrás decimal.
                            
                            Introduce una opción: \s
                            """);
                    opt2 = scan.nextInt();

                    switch (opt2) {
                        case 1:{
                            System.out.println("Introduce un numero: ");
                            cuentaAtras(scan.nextInt());
                            enterContinuar();
                            break;
                        }
                        case 2: {
                            System.out.println("Introduce Dos numeros: ");
                            cuentaAtras(scan.nextInt(), scan.nextInt());
                            enterContinuar();
                            break;
                        }
                        case 3: {
                            System.out.println("Introduce un numero (Puede ser decimal): ");
                            cuentaAtras(scan.nextFloat());
                            enterContinuar();
                            break;
                        }
                        default:
                            System.out.println("Introduce una opcion valida ( 1, 2, 3");
                    }
                    break;

                case 3:
                    System.out.println("Introduce un numero: ");
                    int total = sumatorio(scan.nextInt());
                    System.out.println("El resultado total es: " + total);
                    enterContinuar();
                    break;
                case 0:
                    System.out.println("Gracias por utilizar nuestro programa");
                    break;
                default:
                    System.out.println("Elija una opcion valida (1,2,3,0");
            }
        } while (opt != 0);
    }

    static void enterContinuar () {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Presiona ENTER para continuar...");
        scan.nextLine();
    }
    // OPCION 1 ----------------------------------------------------------------------------------
    private static boolean numerosPrimos(int num) {
        if (num <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
    // OPCION 2 ----------------------------------------------------------------------------------
    static void cuentaAtras (int num) {
        if (num == 0) {
            System.out.print(num + " ");
        }else {
            System.out.print(num + " ");
            cuentaAtras(num-1);
        }
    }
    static void cuentaAtras (int num1, int num2) {
        if (num1<=num2) {
            if (num2==num1) {
                System.out.print(num2 + " ");
            }else {
                System.out.print(num2 + " ");
                cuentaAtras(num1,num2-1);
            }
        } else if (num2<=num1) {
            if (num1==num2) {
                System.out.print(num1 + " ");
            }else {
                System.out.print(num1 + " ");
                cuentaAtras(num2,num1-1);
            }
        }
    }
    static void cuentaAtras (float num) {
        for (float i = num; i >= 0.0; i-= 0.1F) {
            System.out.printf("%.1f\n",i);
        }
    }
    // OPCION 3 ----------------------------------------------------------------------------------
    static int sumatorio(int num) {
        if (num == 0) {
            return num;
        } else {
            return num + sumatorio(num - 1);

        }
    }
}