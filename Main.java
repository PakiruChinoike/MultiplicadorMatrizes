import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Determine o número de colunas e linhas da primeira matriz.");

        int m = keyboard.nextInt();
        int n = keyboard.nextInt();

        int[][] matrizA = new int[m][n];

        System.out.println("Determine o número de colunas e linhas da segunda matriz.");

        int k = keyboard.nextInt();
        int l = keyboard.nextInt();

        int[][] matrizB = new int[k][l];

        System.out.println("Determine os valores de cada espaço da primeira matriz.");

        for (int i = 0; i<m; i++) {
            for (int j = 0; j<n; j++) {
                matrizA[i][j] = keyboard.nextInt();
            }
        }

        System.out.println("Determine os valores de cada espaço da segunda matriz.");

        for (int i = 0; i<k; i++) {
            for (int j = 0; j<l; j++) {
                matrizB[i][j] = keyboard.nextInt();
            }
        }

        if (n==k) {
            System.out.println("A matriz é computável.");
            int[][] matrizC = new int[m][l];

            for (int i = 0; i<m; i++) {
                for (int j = 0; j<l; j++) {
                    matrizC[i][j] = matrizA[i][j]*matrizB[i][j] + matrizA[i+1][j]*matrizB[i][j+1] + matrizA[i+2][j]*matrizB[i][j+2]; 
                }
            }
        }
        else {
            System.out.println("Impossível computar as matrizes.");
        }

        keyboard.close();
    }
}