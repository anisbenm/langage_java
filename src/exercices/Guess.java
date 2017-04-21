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
public class Guess {
    
    public static void main(String[] args) {
        
        Scanner scan=new Scanner(System.in);
        String s="n";
        do{
        System.out.println("Nouvelle partie");
       // System.out.println("entez le nombre secret : ");
        //int nbr=scan.nextInt();
        int nbr2=(int)(Math.random()*100);
       //System.out.println(nbr2);
        partie(nbr2);
        System.out.println("voulez vous recommancer (y/n)");
        s=scan.next();
    } while(s.equalsIgnoreCase("y"));
    }

    private static void partie(int nbr) {
        Scanner scan=new Scanner(System.in);
        int ent;
        int count=0;
         System.out.println("devinez le numéro : ");
        do{
            count++;
        ent=scan.nextInt();
        if(ent>nbr){
            System.out.println("le nombre recherché est plus petit");
        }
        else if(ent<nbr){
             System.out.println("le nombre recherché est plus grand");
        }
        }while(ent!=nbr);
         System.out.println("correct");
         System.out.println("Nombre d'essai : "+ count);
        if(count<=3){
            System.out.println("***");
        }else if (count<=6){
            System.out.println("**");
        }else{
            System.out.println("Trop nul!");
        }
        
    }
    
}
