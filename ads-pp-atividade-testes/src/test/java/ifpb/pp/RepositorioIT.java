/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.pp;

import edu.ifpb.pp.infraestrutura.db.DBUnitHelper;
import ifpb.pp.pessoa.Pessoa;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


/**
 *
 * @author Anderson Souza
 */
public class RepositorioIT {
    private Repositorio<Number, Pessoa> repo;
    private Pessoa pessoa;
    
    public RepositorioIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        //arquivos do banco
        new DBUnitHelper().cleanInsert("/tabelas/data.xml");
        pessoa = new Pessoa();
        repo = new RepositorioPessoa();
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of salvar method, of class Repositorio.
     */
    @Test
    public void testSalvar() {
        boolean expResult = false;
        boolean result = repo.salvar(pessoa);
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of remover method, of class Repositorio.
     */
    

    
   
    
}
