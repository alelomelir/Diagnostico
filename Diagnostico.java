
public class Diagnostico {

    public static void main(String[] args) {
        int i = 0;
        for (i = 0; i <= 3; i++) {
            System.out.println("Veces que corrio el primer for: " + i);
            for (int j = 0; j <= 3; j++) {
                System.out.println("Veces que corrio el segundo for: " + j);
                for (int k = 0; k <= 3; k++) {
                    System.out.println("Veces que corrio el tercer for: " + k);
                }
            }
        }
    }
}
