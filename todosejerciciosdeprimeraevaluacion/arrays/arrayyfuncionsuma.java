package arrays;

public class arrayyfuncionsuma {
    static int sumacion ( int arreglo[]){
        int result = 0;
        for (int i = 0; i < 4; i++) {
            result += arreglo[i];
        }
        return result;
    }
    public static void main (String[]args){
        int arreglo[] = {2, 4, 5, 6};
        System.out.println(sumacion(arreglo));
    }
}