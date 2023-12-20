package funciones;

public class funcioncuantosnumerosprimos {
    public static void main(String[] args) {
        int i=2,primosEncontrados = 0,primosTotales=10;

        while (primosEncontrados<primosTotales) {
            if (esPrimo(i)){
                System.out.print(i);
            }
            i++;
        }
    }

    // Método para verificar si un número es primo
    public static boolean esPrimo(int numero) {
        int result,vardiv=numero-1;
        if (numero==0){
            return false;
        }else {
            while (vardiv<2) {
                result = numero%vardiv;
                if (result==0) {
                    return true;
                }
            }
            return false;
        }
    }
}