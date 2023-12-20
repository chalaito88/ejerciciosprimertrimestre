package arrays;

public class ejercicioampliacion {
    static void busquedadicotomica(int[] arraydecien ) {

    }
public static void main(String[] args) {
        /*Diseña y desarrolla el algoritmo de búsqueda dicotómica/binaria, sin
        utilizar la función binarySearch. Mide la diferencia de tiempo de búsqueda en arrays de grandes
        dimensiones, utilizando búsqueda binaria frente a búsqueda secuencial. */

    int arraydecien[] = new int[1000];

    for ( int i = 0 ; i < 1000 ; i++ ) {
        arraydecien[i] = (int)(Math.random()*100+1);
    }
        busquedadicotomica(arraydecien,6);
}
}