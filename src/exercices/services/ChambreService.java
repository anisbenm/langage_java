/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercices.services;

import exercices.entity.Chambre;
import exercices.entity.Compte;
import exercices.exceptions.ChambreIndisponibleException;
import exercices.exceptions.SoldeInsuffisantException;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author Administrateur
 */
public class ChambreService {
    public void reserver(long idChambre,long idCompte) throws ChambreIndisponibleException, SoldeInsuffisantException{
        EntityManager em = Persistence.createEntityManagerFactory("PU").createEntityManager();
        Chambre cb=em.find(Chambre.class, idChambre);
        Compte cp=em.find(Compte.class, idCompte);
        if(cb.getReservee()){
            throw (new ChambreIndisponibleException());
        }
        else if(cb.getPrix()>cp.getSolde()){
            throw (new SoldeInsuffisantException());
        }else{
        em.getTransaction().begin();
        cb.setReservee(Boolean.TRUE);
        cp.setSolde(cp.getSolde()-cb.getPrix());
        em.getTransaction().commit();
        }
    }
    
}
