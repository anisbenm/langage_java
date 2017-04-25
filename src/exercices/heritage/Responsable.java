/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.heritage;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Administrateur
 */
public class Responsable extends Employe{
    private Set<Employe> employes=new HashSet<>();

    public Set<Employe> getListEmployes() {
        return employes;
    }

    public void setListEmployes(Set<Employe> listEmployes) {
        this.employes = listEmployes;
    }

    
 
    
//    public String afficheListe(){
//    String str='';
//    return str;}

    @Override
    public String toString() {
       // return "Responsable{" + "listEmployes=" + listEmployes + '}';
       return String.format("Responsable : %s Liste des employes: %s",super.toString(),this.employes );
    }
}
