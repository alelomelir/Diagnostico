public class Diagnostico {

    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int[][] arreglo = {
                { 1, 2, 3, 4, 5, 6 },
                { 7, 8, 9, 10, 11, 12 }
        };

        for (i = 0; i <= 2; i++) { // itera entre arreglos
            for (j = 0; j <= 5; j++) { // itera entre elementos
                System.out.println(arreglo[i][j]);
            }

        }
    }
}
