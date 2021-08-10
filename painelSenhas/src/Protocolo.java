
import java.util.Collections;

/**
 *
 * @author johnny
 */
public class Protocolo {
    private String tipo;
    private int numero;
    private String caixa;

    
    public Protocolo(){
        
    }
    
    public Protocolo(String tipo, int numero, String caixa) {
        this.tipo = tipo;
        this.numero = numero;
        this.caixa = caixa;
    }
    
    

    public String getTipo() {
        
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCaixa() {
        return caixa;
    }

    public void setCaixa(String caixa) {
        this.caixa = caixa;
    }

    @Override
    public String toString() {
        return "Protocolo{" + "tipo=" + tipo + ", numero=" + numero + ", caixa=" + caixa + '}';
    }

   

 
    
    
    
    
}
