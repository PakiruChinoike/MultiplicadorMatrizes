import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Determine o número de linhas e colunas da primeira matriz.");

        //RECEBE UM VALOR INTEIRO "m" DE LINHAS
        int m = keyboard.nextInt();

        //RECEBE UM VALOR INTEIRO "n" DE COLUNAS
        int n = keyboard.nextInt();

        //DECLARA A PRIMEIRA MATRIZ
        int[][] matrizA = new int[m][n];

        System.out.println("Determine o número de linhas e colunas da segunda matriz.");

        //RECEBE UM VALOR INTEIRO "k" DE LINHAS
        int k = keyboard.nextInt(); 

        //RECEBE UM VALOR INTEIRO "l" DE COLUNAS
        int l = keyboard.nextInt();

        //DECLARA A SEGUNDA MATRIZ
        int[][] matrizB = new int[k][l];

        if (n!=k) {
            System.out.println("As matrizes não podem ser computadas.");
        }
        else {
            System.out.println("Determine os valores de cada espaço da primeira matriz.");

        //DEFINE OS VALORES PARA CADA ESPAÇO DA MATRIZ
        for (int i = 0; i<m; i++) {
            for (int j = 0; j<n; j++) {
                matrizA[i][j] = keyboard.nextInt();
            }
        }

        System.out.println("Determine os valores de cada espaço da primeira matriz.");

        //DEFINE OS VALORES PARA CADA ESPAÇO DA MATRIZ
        for (int i = 0; i<k; i++) {
            for (int j = 0; j<l; j++) {
                matrizB[i][j] = keyboard.nextInt();
            }
        }

        //DECLARA A MATRIZ RESULTANTE
        int[][] matrizC = new int[m][l];

        for (int i = 0; i<m; i++) {
            //INSTANCIA UMA VARIÁVEL "x" PARA O RECEBIMENTO DOS DADOS DA MULTIPLICAÇÃO
            int x = 0;
            for (int j = 0; j<l; j++) {
                x = 0;
                for (int y = 0; y<n; y++) {
                    //REALIZA A MULTIPLICAÇÃO
                    x = x + (matrizA[i][y] * matrizB[y][j]); 
                }
                matrizC[i][j] = x;
            }
        }

        System.out.println("A seguir, a matriz resultante:"); 

        //INSTANCIA A VARIÁVEL DO TEXTO DA MATRIZ
        String resultado = "";

        for (int i = 0; i<m; i++) {
            for (int j = 0; j<l; j++) {
                resultado = resultado + matrizC[i][j] + " ";
            }
            resultado = resultado + "%n";
        }

        System.out.printf(resultado);

        }

        keyboard.close();
    }
}