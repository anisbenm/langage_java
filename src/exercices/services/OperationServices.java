/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.services;

import com.sun.xml.internal.org.jvnet.mimepull.DecodingException;
import exercices.entity.Compte;
import exercices.exceptions.DecouvertException;
import exercices.exceptions.OperationInterditeException;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Administrateur
 */
public class OperationServices {

    public void transferer(long idCompteCible, long idCompteOrigine, float montant) throws DecouvertException {
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();

        em.getTransaction().begin();

        Compte cpo = em.find(Compte.class, idCompteOrigine);
        Compte cpc = em.find(Compte.class, idCompteCible);
        if (cpo.getSolde() >= montant) {
            cpo.setSolde(cpo.getSolde() - montant);
            cpc.setSolde(cpc.getSolde() + montant);
        } else {
            DecouvertException e = new DecouvertException();
            throw e;
        }

        em.getTransaction().commit();

    }

    public void debiter(long idCompte, float montant) throws OperationInterditeException, DecouvertException {
        if (montant > 1000) {
            throw (new OperationInterditeException());
        } else {
            EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
            Compte c = em.find(Compte.class, idCompte);
            if (c.getSolde() >= montant) {
                em.getTransaction().begin();
                c.setSolde(c.getSolde()-montant);
                em.getTransaction().commit();
            } else {
                throw (new DecouvertException());
            }

        }
    }

    public void interetsAnnuels(float p){
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        Query query = em.createQuery("SELECT c FROM Compte c");
        List<Compte> comptes=query.getResultList();
        em.getTransaction().begin();
        for(Compte c:comptes ){
            c.setSolde(c.getSolde()*(1+(p/100)));
        }
        em.getTransaction().commit();
    }
    
    public void retire(Compte c, float valeure){
    
    
    }
    
}
