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
public class Poisson extends Animal{

    public Poisson(String nom) {
        super(nom);
    }



    @Override
    public void bouger() {
        this.x++;
        System.out.println(String.format("%s nage vers la position: %d %d ", this.nom,this.x,this.y));
    }

    @Override
    public void parler() {
         System.out.println("bok bok bok");
    }
    
}
