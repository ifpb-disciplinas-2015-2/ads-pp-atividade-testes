package ifpb.pp.pessoa;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 03/03/2016, 15:57:59
 */
@Entity
public class Endereco {

    @Id
    @GeneratedValue
    private Long id;
    private String rua;
    private String bairro;

    public Endereco() {
    }

    public Endereco(String rua, String bairro) {
        this.id = id;
        this.rua = rua;
        this.bairro = bairro;
    }
    
    

    
    public Long getId() {
        return id;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

}
