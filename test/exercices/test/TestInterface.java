/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.test;

import exercices.interfaces.Flottant;
import exercices.interfaces.Mitraillant;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import exercices.interfaces.Bombardant;
import exercices.interfaces.BombardierFlottant;
import exercices.interfaces.HydravionMitrailleur;

/**
 *
 * @author Administrateur
 */
public class TestInterface {
    @Test
    public void InterfaceTest() {
        List<Flottant> flottants = new ArrayList<>();
        List<Mitraillant> mitraillants = new ArrayList<>();
        List<Bombardant> bombardants = new ArrayList<>();
        BombardierFlottant bf1 = new BombardierFlottant();
        flottants.add(bf1);
        mitraillants.add(bf1);
        bombardants.add(bf1);
        BombardierFlottant bf2 = new BombardierFlottant();
        flottants.add(bf2);
        mitraillants.add(bf2);
        bombardants.add(bf2);
        HydravionMitrailleur hm1 = new HydravionMitrailleur();
        mitraillants.add(hm1);
        flottants.add(hm1);
        HydravionMitrailleur hm2 = new HydravionMitrailleur();
        mitraillants.add(hm2);
        flottants.add(hm2);
        
        
        for(Flottant f:flottants){f.flotter();}
        for(Mitraillant m:mitraillants){m.mitrailler();}
        for(Bombardant b:bombardants){b.bombarder();}
    }

}
