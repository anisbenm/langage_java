/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.test;

import exercices.entity.Chambre;
import exercices.exceptions.ChambreIndisponibleException;
import exercices.exceptions.SoldeInsuffisantException;
import exercices.services.ChambreService;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrateur
 */
public class ReserverDebiterTest {
//    @Test
    public void testAjouChambre() {
        
        Chambre ch = new Chambre("loula",200F);
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        em.persist(ch);
        em.getTransaction().commit();
        
    }
    
    @Test
    public void reservationTest() throws ChambreIndisponibleException, SoldeInsuffisantException{
        ChambreService chs=new ChambreService();
        chs.reserver(101, 2);
    }
}
