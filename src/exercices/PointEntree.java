/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices;

/**
 *
 * @author Administrateur
 */
public class PointEntree {
    public static void main(String[] args) {
        PointEntree pt = new PointEntree();
        pt.affiche(args[0]);
        pt.affiche(args[1]);
        pt.affiche(args[2]);
    }
    
    public void affiche(String textAAfficher){
    System.out.println(textAAfficher);
    }
}
