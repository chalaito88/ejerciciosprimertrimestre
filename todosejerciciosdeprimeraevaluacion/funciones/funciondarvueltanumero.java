package funciones;

public class funciondarvueltanumero {
    public static void main(String[] args) {
        //Crea un método recursivo que reciba un número como parámetro y lo imprima invertido por
        //pantalla.
        int numerete = 123456;
        invertido(numerete);


    }
    static void invertido (int num) {
        if (num<10) {
            System.out.print(num);
        } else {
            System.out.print(num%10);
            invertido(num/10);
        }
    }
}