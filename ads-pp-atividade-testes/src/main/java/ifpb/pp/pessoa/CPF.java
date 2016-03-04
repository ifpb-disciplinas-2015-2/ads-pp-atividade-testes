package ifpb.pp.pessoa;

import javax.persistence.Embeddable;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 03/03/2016, 15:26:51
 */
@Embeddable
public class CPF {

    private String valor;

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    
    
    public String formatado(){
        // Formatar
        return valor;
    }
    public String valor(){
        return valor;
    }
}
