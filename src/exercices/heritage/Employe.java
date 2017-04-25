/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.heritage;

/**
 *
 * @author Administrateur
 */
public class Employe extends Personne{
    private double salaire;

    public double getSalaire() {
        return salaire;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    
    @Override
    public String toString() {
        return super.toString()+"Employe{" + "salaire=" + salaire + '}';
    }


}
