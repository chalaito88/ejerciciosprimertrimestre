package arrays;

public class igualararrays {
    public static void main(String[] args) {
        int[] arrayX = {1, 2, 3};
        int[] arrayY;
        arrayY = arrayX;
        arrayY[0]=9;
        arrayY[1]=9;
        arrayY[2]=9;
        System.out.println("arrayX tiene valores: [" + arrayX[0] + ", " +
                + arrayX[1] + ", " +
                + arrayX[2] + "]");

    }
}
