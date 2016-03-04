/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.pp;

import ifpb.pp.pessoa.Pessoa;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;

/**
 *
 * @author Anderson Souza
 */
public class RepositorioPessoa implements Repositorio<Number, Pessoa> {

    private EntityManager em = Persistence.createEntityManagerFactory("default").createEntityManager();

    @Override
    public boolean salvar(Pessoa pessoa) {
        em.getTransaction().begin();
        try {
            em.persist(pessoa);
//            em.flush();
            em.getTransaction().commit();
            
            return true;
        } catch (IllegalStateException e) {
            em.getTransaction().rollback();
            e.printStackTrace();
            e.getMessage();
            return false;
        } finally {
//            em.close();
        }
    }

    @Override
    public boolean remover(Pessoa pessoa) {
        em.getTransaction().begin();
        try {
            em.remove(pessoa);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            return false;
        } finally {
//            em.close();
        } 
    }

    @Override
    public boolean remover(Number key) {
        em.getTransaction().begin();
        try {
            Pessoa p = em.find(Pessoa.class, key);
            em.remove(p);
            em.getTransaction().commit();
            return true;
        } catch (Exception e) {
            return false;
        } finally {
//            em.close();
        } 
    }

    @Override
    public Pessoa localizar(Number key) {
        return em.find(Pessoa.class, key);
    }

    @Override
    public List<Pessoa> todos() {
        return em.createQuery("Select p from Pessoa p", Pessoa.class).getResultList();
    }

}
