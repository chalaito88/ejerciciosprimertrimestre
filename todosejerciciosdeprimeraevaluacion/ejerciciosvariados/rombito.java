package ejerciciosvariados;

import java.util.Scanner;

public class rombito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int num = scan.nextInt();

        for (int i=1;i<=num;i++) {
            for (int l=num;l>=i;l--) {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print(" *");
            }
            System.out.println();
        }
        for (int i=1;i<=num;i++) {
            for (int j=1;j<=i+1;j++){
                System.out.print(" ");

            }
            for (int l=num;l>i;l--){
                System.out.print(" *");
            }

            System.out.println();
        }

    }
}