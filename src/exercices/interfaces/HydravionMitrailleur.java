/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.interfaces;

/**
 *
 * @author Administrateur
 */
public class HydravionMitrailleur implements Flottant, Volant, Mitraillant {

    @Override
    public void flotter() {
            System.out.println("HydravionMitrailleur flotte");
    }

    @Override
    public void voler() {
            System.out.println("HydravionMitrailleur vole");
    }

    @Override
    public void mitrailler() {
            System.out.println("HydravionMitrailleur mitraille");
    }
    
}
