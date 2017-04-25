/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.test;

import exercices.objet.Client;
import exercices.objet.Commande;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrateur
 */
public class ClientCommandeTest {
    @Test
    public void ClientTest() {
        Commande cd = new Commande("voiture",1920);
       // cd.afficher();
        Client cl=new Client("Samba", "Sy", 33, cd);
       // cl.afficher();
         Commande cd2 =new Commande();
     //    cd2.saisieCommande(); // ça marche pas car le test n'a pas acces à la console
      //   cd2.afficher();
        System.out.println(cl);
        System.out.println(cd2); 
    }
    
}
