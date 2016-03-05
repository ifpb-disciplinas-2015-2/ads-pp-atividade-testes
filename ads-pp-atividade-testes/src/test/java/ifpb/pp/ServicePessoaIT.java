/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.pp;

import ifpb.pp.pessoa.CPF;
import ifpb.pp.pessoa.Endereco;
import ifpb.pp.pessoa.Pessoa;
import java.util.List;
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
    private Endereco end;
    private CPF cpf;
    private byte[] img;
    private Pessoa pessoa;

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
        end = new Endereco(20L, "Rua qualquer", "Multirao");
        img = new byte[50];
        cpf = new CPF("098.365.385-00");
        pessoa = new Pessoa(2L, "Jorge", img, cpf, end);
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
    @Test
    public void testRemoverPorObj() {
        Pessoa p1 = new Pessoa();
        when(repo.remover(pessoa)).thenReturn(true);
        boolean p = repo.remover(p1);
        assertFalse(p);

    }

    /**
     * Test of remover method, of class ServicePessoa.
     */
    @Test
    public void testSalvar() {
        Pessoa p = new Pessoa();
        when(repo.salvar(pessoa)).thenReturn(true);
        boolean verifica = repo.salvar(p);
        assertFalse(verifica);
        verifica = repo.salvar(pessoa);
        assertTrue(verifica);

    }

    @Test
    public void testTodos() {
        when(repo.todos()).thenReturn(null);

        List result = repo.todos();
        assertNull(result);

    }
}
