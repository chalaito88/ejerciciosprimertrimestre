package funciones;

public class funcionsobrecargada2 {
    public static void main(String[] args) {
        System.out.println(miFuncion(2,5,1));
    }
    static int miFuncion (int num1, int num2) {
        int resultado = num1+num2;
        return resultado;
    }
    static int miFuncion (int num1, int num2, int num3) {
        int acumulamiento=0;
        for (int i=1;i<=num2;i++) {
            acumulamiento=miFuncion(acumulamiento,num1);
        }
        for (int i=1;i<=num3;i++) {
            acumulamiento=miFuncion(acumulamiento,num3);
        }
        return num1;
    }
}