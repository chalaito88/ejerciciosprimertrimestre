package ejerciciosvariados;

import java.util.Scanner;

public class contadordedigitos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 0;
        do {
            System.out.println("Introduce un numero");
            num = scan.nextInt();
            if (num > 0 && num <= 9 ){
                System.out.println("El numero introducido tiene un digito");
            } else if (num >9 && num <99) {
                System.out.println("El numero introducido tiene dos digitos");
            } else if (num > 99 && num <999){
                System.out.println("El numero introducido tiene tres digitos");
            } else {
                System.out.println("El numero tiene que estar entre 0 - 999");

            }
        } while (num == 0);
    }
}
