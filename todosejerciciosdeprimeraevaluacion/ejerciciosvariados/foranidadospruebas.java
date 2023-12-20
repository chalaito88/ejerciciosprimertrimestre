package ejerciciosvariados;

public class foranidadospruebas {
    public static void main(String[] args) {

        for (int fila =1;fila<=10;fila++){
            for (int colum=1; colum<=10;colum++){
                System.out.print(fila + " x " + colum + " = " + fila*colum + " | " );
            }
            System.out.println();
        }
    }
}