package funciones;

public class potencia {
    public static void main(String[] args) {
        int base=5, exponente=2;
        System.out.println(potencia(base,exponente));

    }
    static int potencia (int base, int exponente) {
        int resu=1;
        for (int i=1;i<=exponente;i++) {
            resu=resu*base;
        }
        return resu;
    }
}