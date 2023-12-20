package funciones;

public class sumaprimeros100numeros {
    public static void main(String[] args) {
        //Utilizando la función anterior, realiza la suma de los 100 primeros números de 3 en 3. El
        //resultado será: 6 15 24 …
        System.out.println(sumaciendetresentres(10));
    }
    static int sumaciendetresentres (int num) {
        int resultado=0,tope;
        tope=num+100;
        for (int i=0; i<=tope;i+=3) {
            resultado=+i;
        }
        return resultado;
    }
}
