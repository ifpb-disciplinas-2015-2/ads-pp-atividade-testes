/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.pp.loader;

import ifpb.pp.ServicePessoa;
import ifpb.pp.pessoa.CPF;
import ifpb.pp.pessoa.Pessoa;

/**
 *
 * @author Anderson Souza
 */
public class Loader {

    public static void main(String[] args) {

        CPF cpf = new CPF();
        cpf.setValor("456789");
        byte[] image = new byte[50];

        Pessoa pessoa = new Pessoa();
        pessoa.setCpf(cpf);
        pessoa.setFoto(image);
        
        ServicePessoa service = new ServicePessoa();
        service.salvar(pessoa);

    }

}
