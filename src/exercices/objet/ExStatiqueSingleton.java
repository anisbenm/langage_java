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
public class ExStatiqueSingleton {
    private static int nbInstances=0;
    private static ExStatiqueSingleton singleton;
    private ExStatiqueSingleton(){
        nbInstances++;
    }
    
    public static void afficheNbInstances() {
        System.out.println("nombre d'instances : "+ExStatiqueSingleton.nbInstances);
    }
    
    public static ExStatiqueSingleton getInstance(){
        if(singleton==null) {singleton= new ExStatiqueSingleton();}
        return singleton;
    }
}
