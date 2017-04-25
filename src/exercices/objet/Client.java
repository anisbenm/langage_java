/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.objet;

/**
 *
 * @author Administrateur
 */
public class Client {
    private String nom;
    private String prenom;
    private int age;
    private Commande commande;

    public Client(String nom, String prenom, int age, Commande commande) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.commande = commande;
    }
//   public void afficher() {
//        System.out.println("*****Client*****");
//        System.out.println("nom :" + nom);
//        System.out.println("prenom :" + prenom);
//        System.out.println("age :" + age);
//        commande.afficher();
//   }

    @Override
    public String toString() {
        return "Client{" + "nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", commande=" + commande + '}';
    }
    
}
