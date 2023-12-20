package funciones;

public class funcionsumar {
    public static void main(String[] args) {
        //Crea una función que sume tres números enteros y pruébala desde un método main.
        System.out.println(funcionSuma(3,2,1));
    }

    static int funcionSuma (int num1, int num2, int num3) {
        int resultado = num1+num2+num3;
        return resultado;
    }
}
