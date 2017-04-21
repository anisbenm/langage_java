/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package newpackage;

/**
 *
 * @author Administrateur
 */
public class Tableau {

    public static void main(String[] args) {
        String[][] tab = creerTab(50, "*");//céation d'une matrice de dimension le premier argument et remplie par la chaine argument2
        remplir(tab, "$");
        affiche(tab);
    }

    private static void remplir(String[][] tab, String st) {
        int l;
        int c;
        int nCases = tab.length;
        for (int h = 0; h < nCases; h++) {
            l = (int) (Math.random() * nCases);
            c = (int) (Math.random() * nCases);
            if (tab[l][c] != st) {
                tab[l][c] = st;
            }//Integer.toString(h);
            else {
                h--;
            }
        }

    }

    private static String[][] creerTab(int d, String str) {
        String[][] tab = new String[d][d];
        for (int i = 0; i < d; i++) {
            for (int j = 0; j < d; j++) {
                tab[i][j] = str;
            }
        }
        return tab;
    }

    private static void affiche(String[][] tab) {
        int nCases = tab.length;
        for (int i = 0; i < nCases; i++) {
            for (int j = 0; j < nCases; j++) {
                System.out.print(tab[i][j]);

            }
            System.out.println("");
        }
    }
}
