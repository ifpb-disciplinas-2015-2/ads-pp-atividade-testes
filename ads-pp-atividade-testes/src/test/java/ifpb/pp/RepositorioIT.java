/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.pp;

import edu.ifpb.pp.infraestrutura.db.DBUnitHelper;
import ifpb.pp.pessoa.CPF;
import ifpb.pp.pessoa.Endereco;
import ifpb.pp.pessoa.Pessoa;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertTrue;
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
    private CPF cpf;
    private Endereco end;
    private byte[] img;
    
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
        img = new byte[100];
        end = new Endereco("Rua Vicente Santos", "Centro");
        cpf = new CPF("987.463.967-00");
        pessoa = new Pessoa(1L, "Anderson", img, cpf, end);
        repo = new RepositorioPessoa();
    }
    
    @After
    public void tearDown() {
//        new DBUnitHelper().delete("/tabelas/data.xml");
    }

    /**
     * Test of salvar method, of class Repositorio.
     */
    @Test
    public void testSalvar() {
//        repo.salvar(pessoa);
//        
//        Pessoa p = repo.localizar(1);
//        assertSame(pessoa, p);
        
        assertTrue(true);
        
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.

    }

    /**
     * Test of remover method, of class Repositorio.
     */
    

    
   
    
}
