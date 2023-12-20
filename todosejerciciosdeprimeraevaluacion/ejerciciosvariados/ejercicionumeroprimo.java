package ejerciciosvariados;

public class ejercicionumeroprimo {
    public static void main(String[] args) {

        int num=1,contador=1;

        while (contador<=100) {
            boolean esPrimo= true;
            for (int i=2; i>num; i++) {
                if (num%i==0)
                    esPrimo = true;

            }
            if (esPrimo) {
                System.out.println(num);
                contador++;
            }
            num++;
        }

    }

}