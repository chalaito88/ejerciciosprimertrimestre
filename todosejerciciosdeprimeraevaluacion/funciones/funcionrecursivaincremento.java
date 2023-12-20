package funciones;

public class funcionrecursivaincremento {
    public static void main(String[] args) {
        funcionIncrementadora(10);
    }
    static void funcionIncrementadora (int num){
        if (num==1){
            System.out.println(num);
        } else {
            funcionIncrementadora(num-1);
            System.out.println(num);

        }


    }
}