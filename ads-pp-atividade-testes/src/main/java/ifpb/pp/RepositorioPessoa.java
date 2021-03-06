/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.pp;

import ifpb.pp.pessoa.Pessoa;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Anderson Souza
 */
public class RepositorioPessoa implements Repositorio<Number, Pessoa> {

    private EntityManagerFactory emf;
    private EntityManager em;

    public RepositorioPessoa() {
        emf = Persistence.createEntityManagerFactory("default");
        em = emf.createEntityManager();
    }
    
    
    @Override
    public boolean salvar(Pessoa pessoa) {
        em.getTransaction().begin();
        try {
            em.persist(pessoa);
            em.getTransaction().commit();
            return true;
        } catch (IllegalStateException e) {
            em.getTransaction().rollback();
            e.printStackTrace();
            e.getMessage();
            return false;
        } 
    }

    @Override
    public boolean remover(Pessoa pessoa) throws IllegalStateException {
        em.getTransaction().begin();
        try {
            em.remove(pessoa);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            return false;
        } 
    }

    @Override
    public boolean remover(Number key) {
        em.getTransaction().begin();
        try {
            Pessoa p = em.find(Pessoa.class, key);
            if(p != null){
                em.remove(p);
            }
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Pessoa localizar(Number key) {
        return em.getReference(Pessoa.class, key);  
//        return em.find(Pessoa.class, key);
    }

    @Override
    public List<Pessoa> todos() {
         Query query = em.createQuery("Select p From Pessoa p");
         return query.getResultList();
    }

}
