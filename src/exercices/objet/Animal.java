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
public class Animal {
    private String nom;
    private int nbPattes;
    private String genre;

    public String getNom() {
        return nom;
    }

    public int getNbPattes() {
        return nbPattes;
    }

    public String getGenre() {
        return genre;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNbPattes(int nbPattes) {
        this.nbPattes = nbPattes;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void affiche() {
        System.out.println( "Animal{" + "nom=" + nom + ", nbPattes=" + nbPattes + ", genre=" + genre + '}');
    }

    public Animal() {
    }

    public Animal(String nom, int nbPattes, String genre) {
        this.nom = nom;
        this.nbPattes = nbPattes;
        this.genre = genre;
    }


    
    
}
