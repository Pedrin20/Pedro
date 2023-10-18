

import java.security.SecureRandom;
public class Mapa {


    int linhas = 10;
    int colunas = 10;

    public Mapa() {


        String[][] num = new String[linhas][colunas];

        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                num[l][c] = ".";
            }
        }

        for (int l = 0; l < linhas; l++) {
            for (int c = 0; c < colunas; c++) {
                System.out.printf(num[l][c] + " ");
            }
            System.out.println();
        }
    }
}