/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifpb.pp;

import ifpb.pp.pessoa.CPF;
import ifpb.pp.pessoa.Endereco;
import ifpb.pp.pessoa.Pessoa;
import java.util.regex.Pattern;

/**
 *
 * @author Anderson Souza
 */
public class ValidadorPessoa implements Validador<Pessoa> {

    private String regex;

    public ValidadorPessoa() {
        this.regex = "([0-9]{2}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[\\/]?[0-9]{4}[-]?[0-9]{2})|([0-9]{3}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[-]?[0-9]{2})";
    }

    private boolean validarCPF(CPF cpf) {
        Pattern pattern = Pattern.compile(regex);
        String pf = cpf.formatado();
        if (pf.matches(regex)) {
            return true;
        }
        return false;
    }

    private boolean validaImage(byte[] image) {
        boolean result = image != null;
        return result;

    }

    private boolean validaEndereco(Endereco endereco) {
        boolean result = endereco != null;
        return endereco != null;
    }

    @Override
    public boolean validar(Pessoa pessoa) {
        return validarCPF(pessoa.getCpf()) && validaEndereco(pessoa.getEndereco()) && validaImage(pessoa.getFoto());
    }

}
