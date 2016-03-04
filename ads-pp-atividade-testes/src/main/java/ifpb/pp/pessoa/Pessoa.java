package ifpb.pp.pessoa;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 03/03/2016, 15:25:51
 */
@Entity
public class Pessoa implements Serializable {

    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    @Lob    
    private byte[] foto;
    @Embedded
    private CPF cpf;
    @OneToOne(cascade = CascadeType.ALL)
    private Endereco endereco;

    public Pessoa() {
    }

    public Pessoa(String nome, byte[] foto, CPF cpf, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.foto = foto;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    
    public Pessoa(Long id, String nome, byte[] foto, CPF cpf, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.foto = foto;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte[] getFoto() {
        return foto;
    }

    public void setFoto(byte[] foto) {
        this.foto = foto;
    }

    public CPF getCpf() {
        return cpf;
    }

    public void setCpf(CPF cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
}
