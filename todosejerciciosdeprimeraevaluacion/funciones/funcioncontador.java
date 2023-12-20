package funciones;

public class funcioncontador {
    public static void main(String[] args) {
        System.out.println(contador(15647));
    }
    static int contador (int numeros) {
        if (numeros<10) {
            return 1;
        } else {
            return contador(numeros/10)+1;
        }
    }
}