package funciones;

import java.util.Scanner;

public class ejercicioentregable {
    public static void main(String[] args) {

                Scanner scan = new Scanner(System.in);
                int opt;

                do {
                    mostrarMenu();
                    opt= scan.nextInt();

                    switch (opt) {
                        case 1: {
                            System.out.println("Introduce los numeros primos que quieres mostrar");
                            numerosPrimos(scan.nextInt());
                            break;

                        }
                        case 2: {
                            int num1,num2;
                            float num3;
                            //System.out.println("Introduce un numero: ");
                            //num1 = scan.nextInt();
                            //num2 = scan.nextInt();
                            //num3 = scan.nextFloat();
                            num3=10;
                            //cuentaAtras(num1);
                            //cuentaAtras(num1,num2);
                            cuentaAtras(num3);
                            break;
                        }

                        case 3:System.out.println("Tres");
                            break;
                        case 0:System.out.println("Gracias por utilizar nuestro programa");
                            break;
                        default:System.out.println("Elija una opcion valida (1,2,3,0");
                    }
                }while (opt!=0);
            }
            // FUNCION PARA MOSTRAR EL MENU
            static void mostrarMenu () {
                System.out.println("--------------------------------------------");
                System.out.println("1 - Numeros primos");
                System.out.println("2 - Cuenta atras");
                System.out.println("3 - Suma");
                System.out.println("0 - Salir");
                System.out.println("--------------------------------------------");
                System.out.println("Elija una opcion: ");
            }

            // OPCION 1 ----------------------------------------------------------------------------------
            static void numerosPrimos (int num) {
                boolean sino = true;
                int i=2;
                if (num==0) {
                    sino=false;
                }else {
                    while (sino){
                        if (i%2==0 || i%3==0 || i%5==0 || i%7==0){
                            System.out.print(i);
                        }else {
                            System.out.print(i);
                        }
                        i++;
                    }

                }









                //int i=2;
                //while (i<num) {
                //    if (num % i == 0) {
                //        sino = false;
                //        System.out.println("El numero " + i + " No es primo.");
                //   }else
                //        System.out.println("El numero " + i + " es primo.");
                //i++;
                //}
            }
            // OPCION 2 ----------------------------------------------------------------------------------
            static void cuentaAtras (int num) {
                if (num == 0) {
                    System.out.println(num);
                }else {
                    System.out.println(num);
                    cuentaAtras(num-1);
                }
            }
            static void cuentaAtras (int num1, int num2) {
                if (num1<=num2) {
                    if (num2==num1) {
                        System.out.println(num2);
                    }else {
                        System.out.println(num2);
                        cuentaAtras(num1,num2-1);
                    }
                } else if (num2<=num1) {
                    if (num1==num2) {
                        System.out.println(num1);
                    }else {
                        System.out.println(num1);
                        cuentaAtras(num2,num1-1);
                    }
                }
            }
            static void cuentaAtras (float num) {
                if (num == 0.0) {
                    System.out.println(num);
                }else {
                    System.out.println(num);
                    cuentaAtras (num);
                }
            }
            // OPCION 3 ----------------------------------------------------------------------------------
        }