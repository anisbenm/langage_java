/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.test;

import exercices.objet.Animal;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrateur
 */
public class AnimalTest {
    @Test
    public void testAnimal(){        
        Animal renard = new Animal();
        renard.setNom("rox");
        renard.setNbPattes(4);
        renard.setGenre("vertebré");
        renard.affiche();
        
        Animal corbeau=new Animal("berleau",2,"courbeau");
        corbeau.affiche();
       }
}
