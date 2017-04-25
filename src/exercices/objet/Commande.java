/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.objet;

import java.util.Scanner;

/**
 *
 * @author Administrateur
 */
public class Commande {

    private String description;
    private double prix;

    public Commande(String description, double prix) {
        this.description = description;
        this.prix = prix;
    }

    public Commande() {
        
    }

    public void afficher() {
        System.out.println("*****Commande*****");
        System.out.println("description :" + description);
        System.out.println("prix :" + prix);
    }
//    public void saisieCommande(){
//        Scanner scan= new Scanner(System.in);
//        System.out.println("description :" );
//        this.description=scan.nextLine();
//        System.out.println("prix :");
//        this.prix=scan.nextDouble();
//    }

    @Override
    public String toString() {
        return "Commande{" + "description=" + description + ", prix=" + prix + '}';
    }
    
    
}
