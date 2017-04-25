/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.animeaux;

/**
 *
 * @author Administrateur
 */
abstract public class Animal {
    protected String nom;
    protected int x=0;
    protected int y=0;
    abstract public void bouger();
    abstract public void parler();

    public Animal(String nom) {
        this.nom = nom;
    }
    
}
