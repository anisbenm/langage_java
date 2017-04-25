/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.test;

import exercices.heritage.Employe;
import exercices.heritage.Responsable;
import java.awt.image.RescaleOp;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrateur
 */
public class HeritageTest {
    @Test
    public void ResponsableTest() {
        Employe e = new Employe();
        Employe e1 = new Employe();
        e.setNom("hamon");
        e.setPrenom("sarko");
        e1.setNom("françoise");
        e1.setPrenom("benala");
        e.setSalaire(500000);
        e1.setSalaire(9999999);
        System.out.println(e);
        Responsable respensable = new Responsable();
        respensable.setNom("chef");
        respensable.setPrenom("Chifan");
        respensable.setSalaire(568735739);
        respensable.getListEmployes().add(e);
        respensable.getListEmployes().add(e1);
        System.out.println(respensable);
        
    }
    
}
