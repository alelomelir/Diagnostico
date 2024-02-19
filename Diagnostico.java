public class Diagnostico {

    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int[][] arreglo1 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int[][] arreglo2 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        for (i = 0; i <= 2; i++) { // itera entre arreglos
            for (j = 0; j <= 2; j++) { // itera entre elementos

                System.out.println(arreglo1[i][j]);
            }
        }

        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {

                System.out.println(arreglo2[i][j]);
            }
        }

        int[][] arreglo3 = new int[2][2];
        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {
                System.out.println(arreglo1[i][j] + arreglo2[i][j]); // i y j para que sea dinamico
                arreglo3[i][j] = arreglo1[i][j] + arreglo2[i][j];
            }
        }
        for (i = 0; i <= 2; i++) {
            for (j = 0; j <= 2; j++) {

            }
        }
    }
}
