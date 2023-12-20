package arrays;

public class busquedanumarrayfuncion2 {
    static boolean estaono (int listanum[], int num) {
        for (int i =0;i<5;i++) {
            if (listanum[i] == num) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int listanum [] = {7,6,3,8,9};
        int num = 8;
        System.out.println(estaono(listanum, num));
    }
}
