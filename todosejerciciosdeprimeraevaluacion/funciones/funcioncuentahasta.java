package funciones;

import java.util.Scanner;

public class funcioncuentahasta {
    public static void main(String[] args) {
        int num = 0;
        Scanner scan =new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        num = scan.nextInt();
        cuentita(num);
    }
    static void cuentita (int num) {
        for (int i=1;i<=num;i++) {
            System.out.println(i);
        }
    }
}