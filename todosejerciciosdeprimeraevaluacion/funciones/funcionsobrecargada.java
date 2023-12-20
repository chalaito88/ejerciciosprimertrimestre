package funciones;

public class funcionsobrecargada {
    public static void main(String[] args) {

        for (int i = 0; i<=100 ; i++) {
            if (i%2==0) {
                System.out.println(miFuncion(i));
            } else if (i%5==0) {
                System.out.println(miFuncion(i,5));
            }else {
                System.out.println(i);
            }

        }
    }
    static int miFuncion (int num) {
        return num/2;
    }
    static int miFuncion (int num1, int num2){
        return num1/num2;
    }
}