/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.pp.loader;

import ifpb.pp.ServicePessoa;
import ifpb.pp.pessoa.CPF;
import ifpb.pp.pessoa.Endereco;
import ifpb.pp.pessoa.Pessoa;

/**
 *
 * @author Anderson Souza
 */
public class Loader {

    public static void main(String[] args) {

        CPF cpf = new CPF();
        cpf.setValor("000.000.000-45");
        byte[] image = new byte[50];
        
        Endereco end = new Endereco();
        end.setBairro("Centro");
//        end.setId(9L);
        end.setRua("Rua Santa Terezinha");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Anderson");
        pessoa.setCpf(cpf);
        pessoa.setFoto(image);
        pessoa.setEndereco(end);
        
        ServicePessoa service = new ServicePessoa();
        service.salvar(pessoa);

    }

}
