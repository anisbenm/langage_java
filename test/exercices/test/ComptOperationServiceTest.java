/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.test;

import exercices.entity.Compte;
import exercices.exceptions.DecouvertException;
import exercices.exceptions.OperationInterditeException;
import exercices.services.OperationServices;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Administrateur
 */
public class ComptOperationServiceTest {

//    @Test
    public void ajouCompte() {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        em.getTransaction().begin();
        Compte cp;
        cp = new Compte("Anis",9999999999999F);
        em.persist(cp);
         Compte cp2;
        cp2 = new Compte("Samba",9999999999999F);
        em.persist(cp2);   
        em.getTransaction().commit();
    }

    @Test
    public void testTransfer() throws DecouvertException {
        OperationServices op = new OperationServices();
        op.transferer(2, 1, 100);
    }
    @Test
    public void testDebit() throws OperationInterditeException, DecouvertException   {
        OperationServices op = new OperationServices();
        op.debiter(2, 2000);
        
    }
    
    @Test
    public void testInterets(){
        OperationServices op = new OperationServices();
        op.interetsAnnuels(5);
    }
}
