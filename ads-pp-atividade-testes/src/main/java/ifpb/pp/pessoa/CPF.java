package ifpb.pp.pessoa;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 03/03/2016, 15:26:51
 */
@Embeddable
public class CPF implements Serializable {

    private String valor;

    public CPF(String valor) {
        this.valor = valor;
    }

    public CPF() {
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String formatado() {
        // Formatar
        return valor;
    }

    public String valor() {
        return valor;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.valor);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CPF other = (CPF) obj;
        if (!Objects.equals(this.valor, other.valor)) {
            return false;
        }
        return true;
    }
    
}
