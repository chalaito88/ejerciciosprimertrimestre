package funciones;

import java.util.Scanner;

public class convertirasegundos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dias,horas,minutos;
        System.out.println("Ingrese dias: ");
        dias = scan.nextInt();
        System.out.println("Ingrese horas: ");
        horas = scan.nextInt();
        System.out.println("Ingrese minutos: ");
        minutos = scan.nextInt();
        int resul = fullsegundos(dias,horas,minutos);
        System.out.println("Lo introducido tiene " + resul + " segundos");



    }
    static int fullsegundos (int dias,int horas, int minutos) {
        int resul;
        minutos = minutos*60;
        horas = ((horas*60)*60);
        dias = (((dias*24)*60)*60);
        resul = minutos+horas+dias;
        return resul;
    }
}