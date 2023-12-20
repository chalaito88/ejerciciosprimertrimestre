package arrays;

public class busquedanumarrayfuncion {
    static int busquedamaximo ( int listnum[]) {
        int maximo = 0;

        for (int i = 0; i < 5; i++) {
            if (listnum[i] > maximo){
                maximo = listnum[i];
            }
        }
        return maximo;
    }

    public static void main(String[] args) {
        int listnum [] = {4,6,8,3,2};
        System.out.println(busquedamaximo(listnum));
    }
}