/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.pp;

import ifpb.pp.pessoa.Pessoa;
import java.util.List;

/**
 *
 * @author Anderson Souza
 */
public class ServicePessoa implements Service<Number, Pessoa> {
    private Repositorio<Number, Pessoa> repositorio;
    private Validador validador;
    
    public ServicePessoa() {
        repositorio = new RepositorioPessoa();
        validador = new ValidadorPessoa();
    }

    @Override
    public boolean salvar(Pessoa pessoa) {
        if(validador.validar(pessoa)){
            return repositorio.salvar(pessoa);
        }
        return false;
    }

    @Override
    public Pessoa localizar(Number key) {
        return repositorio.localizar(key);
    }

    @Override
    public List<Pessoa> todos() {
        return repositorio.todos();
    }

    @Override
    public boolean remover(Pessoa pessoa) {
        return repositorio.remover(pessoa);
    }

}
