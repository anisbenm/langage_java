/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.test;

import exercices.objet.ExStatiqueSingleton;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrateur
 */
public class ObjetTest {
    @Test//permet d'executer les test pas de main-- ceci est un test unitair
    public void testStatique(){
        System.out.println("premier test dans la classe test");
        // new ExStatique(); avant de mettre le constructeur en private
        ExStatiqueSingleton.getInstance();
        ExStatiqueSingleton.getInstance();
        ExStatiqueSingleton.afficheNbInstances();
        
    }
    @Test//-- ceci est un deuxiem test unitair
    public void testStatique2(){
        //avant de mettre le constructeur en private
        //new ExStatique();//on ne peut pas prédir l'ordre dans lequel les test s'executes 
        ExStatiqueSingleton.afficheNbInstances();
    } 
}
