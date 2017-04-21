/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices;

import java.util.Scanner;

/**
 *
 * @author Administrateur
 */
public class Variable {

    public static void main(String[] args) {
        //entiers
        byte b = -128;
        short s = 3200;
        int i = 1234654644;
        long l = 887578794;
        //décimal
        double d = 123.456;
        float f = (float) 134684654.3254534;

        // string type evolué S majuscule
        String str = "coucou";
       
        boolean bool = true;

        System.out.println(exposant(3, 5));
        
        Scanner scan=new Scanner(System.in);
        String textIn= scan.nextLine();//l'espace sépare les argument donc termin le scan
        System.out.println(textIn);

    }

    private static long exposant(long n, long exp) {
        long res = 1;
        for (int i = 0; i < exp;i++ ) {
            res *= n;
        }
        return res;
    }
}
