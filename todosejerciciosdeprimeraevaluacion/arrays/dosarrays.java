package arrays;

public class dosarrays {
    static void dosarray (int[] listnum1, int[] listnum2){
        listnum2[0]*=listnum1[0];
        listnum2[1]*=listnum1[1];
        listnum2[2]*=listnum1[2];
        listnum2[3]*=listnum1[3];
    }

    public static void main(String[] args) {
        int listnum1[] = {1, 2, 3, 4} , listnum2[] = {5, 6, 7, 8};
        dosarray (listnum1, listnum2);
        System.out.println(" " + listnum1[0] + " " + listnum1[1] + " " + listnum1[2] + " " + listnum1[3]);
        System.out.println(" " + listnum2[0] + " " + listnum2[1] + " " + listnum2[2] + " " + listnum2[3]);
    }
}