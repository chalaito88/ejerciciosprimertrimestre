package funciones;

public class funcionholamundobuclefor {
    public static void main(String[] args) {
        for (int i=0;i<3;i++) {
            if (i%2==0) {
                imprimeHolaMundo();
            }
        }
    }
    static void imprimeHolaMundo () {
        System.out.println("Hola mundo!!");
    }
}