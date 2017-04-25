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
public class Oiseau extends Animal{

    public Oiseau(String nom) {
        super(nom);
    }
        @Override
    public void bouger() {
        x+=2; 
        y+=2;
        System.out.println(String.format("%s Vol vers la position: %d %d ", this.nom,this.x,this.y));
    }

    @Override
    public void parler() {
        System.out.println("ziou ziou");
         
    }
}
