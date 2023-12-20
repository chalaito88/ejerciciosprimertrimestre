package arrays;

public class errordeindicesdearrays {
    public static void main(String[] args) {
        int lista_enteros [] = new int[10];
        float lista_decimales [] = new float[3];
        char list_vocales [] = new char[5];

        int listilla [] = {1,6,7,8};
        double precios [] = {20.8,30.9};
        char letritas [] = { 'A','B'};

        listilla[1]=3;
        System.out.println(listilla[1]);

        precios[0]=10.6;
        System.out.println(precios[0]);

        letritas[1] = 'C';
        System.out.println(letritas[1]);

        // Tiene que dar un error
        System.out.println(letritas[5]);

    }
}