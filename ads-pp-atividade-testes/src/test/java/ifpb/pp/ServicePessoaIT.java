/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.pp;

import ifpb.pp.pessoa.Pessoa;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

/**
 *
 * @author Anderson Souza
 */
public class ServicePessoaIT {

    @Mock
    private Repositorio<Number, Pessoa> repo;

    public ServicePessoaIT() {

    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of salvar method, of class ServicePessoa.
     */
    @Test
    public void testLocalizar() {
        when(repo.localizar(1L)).thenReturn(null);
        Pessoa p = repo.localizar(1L);
        assertNull(p);
        
        when(repo.localizar(2L)).thenReturn(p);
        
        Pessoa p2 = repo.localizar(2L);
        
        assertSame(p2, p);
        
    }

    /**
     * Test of localizar method, of class ServicePessoa.
     */
    @Test
    
    public void testRemover() {
        when(repo.remover(18L)).thenReturn(false);
        when(repo.remover(1L)).thenReturn(true);
        boolean verificacao = repo.remover(1L);
        assertTrue(verificacao);
        verificacao = repo.remover(18L);
        assertFalse(verificacao);
        
    }
    /**
     * Test of todos method, of class ServicePessoa.
     */
//    @Test
//    public void testTodos() {
//        System.out.println("todos");
//        ServicePessoa instance = new ServicePessoa();
//        List<Pessoa> expResult = null;
//        List<Pessoa> result = instance.todos();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of remover method, of class ServicePessoa.
     */
//    @Test
//    public void testRemover() {
//        System.out.println("remover");
//        Pessoa pessoa = null;
//        ServicePessoa instance = new ServicePessoa();
//        boolean expResult = false;
//        boolean result = instance.remover(pessoa);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}
