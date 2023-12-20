package funciones;

public class funcionrecursivadecremento {
    public static void main(String[] args) {
        funcionDecreciente(10);
    }
    static int funcionDecreciente(int num)  {
        if (num==1){
            // Caso base
            System.out.println(num);
        }else {
            System.out.println(num);
            funcionDecreciente(num-1);
        }
        return num;
    }
}
