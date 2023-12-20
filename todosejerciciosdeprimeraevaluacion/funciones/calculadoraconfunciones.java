package funciones;

import java.util.Scanner;

public class calculadoraconfunciones {
    public static void main(String[] args) {
        int num1,num2,opt;
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce el primer operador: ");
        num1= scan.nextInt();
        System.out.println("Introduce el primer operador: ");
        num2= scan.nextInt();
        System.out.println("------------------------");
        System.out.println("1 - Sumar");
        System.out.println("2 - Restar");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("------------------------");
        System.out.println("Introduce una opcion: ");
        opt= scan.nextInt();
        scan.close();
        switch (opt) {
            case 1:
                sumita (num1,num2);
                break;
            case 2:
                restita(num1,num2);
                break;
            case 3:
                multiplicacioncita(num1,num2);
                break;
            case 4:
                divisioncita(num1,num2);
                break;
            default:
                System.out.println("Introduce una opcion correcta");
        }
    }
    static void sumita(int num1,int num2) {
        System.out.println(num1+num2);
    }
    static void restita(int num1,int num2) {
        System.out.println(num1-num2);
    }
    static void multiplicacioncita(int num1,int num2) {
        System.out.println(num1*num2);
    }
    static void divisioncita(int num1,int num2) {
        System.out.println(num1/num2);
    }
}