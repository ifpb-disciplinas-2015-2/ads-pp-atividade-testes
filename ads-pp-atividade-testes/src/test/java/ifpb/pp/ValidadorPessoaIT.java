/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.pp;

import ifpb.pp.pessoa.CPF;
import java.util.Arrays;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 *
 * @author Anderson Souza
 */
@RunWith(Parameterized.class)
public class ValidadorPessoaIT {
    private CPF cpf;
    private boolean value;
    private ValidadorPessoa validador;
    
    
    public ValidadorPessoaIT(CPF cpf, boolean value){
        this.cpf = cpf;
        this.value = value;
        validador = new ValidadorPessoa();
    }
    
    @Parameters
    public static List<Object[]> getValues(){  
        return Arrays.asList(new Object[][]{
            {new CPF("093.134.967-99"), true},
            {new CPF("09313496799"), true},
            {new CPF("093.196799"), false},
            {new CPF("093.134.967-99"), true},
            {new CPF("093.134967-99"), true},
            {new CPF(""), false}
        });
    }
    
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of validar method, of class ValidadorPessoa.
     */
    @Test
    public void testCPF() {
//      //Verifica cada iteração da lista com a anotação @Parameters
        assertEquals(validador.validarCPF(cpf), value);
    }
    
}
