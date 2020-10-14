
package modelo;

import java.util.Date;

/**
 *
 * @author GENATCHI
 */
public class AssocTaxista {
    
    private int idAssociadoT;
    private String nome;
    private String numBi;
    private String CartaCond;
    private String telefone;
    private Date datNasc;
    private Date datCastro;
    private String cargo;
    private Date datCargo;

    public AssocTaxista() {
    }

    public int getIdAssociadoT() {
        return idAssociadoT;
    }

    public void setIdAssociadoT(int idAssociadoT) {
        this.idAssociadoT = idAssociadoT;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumBi() {
        return numBi;
    }

    public void setNumBi(String numBi) {
        this.numBi = numBi;
    }

    public String getCartaCond() {
        return CartaCond;
    }

    public void setCartaCond(String CartaCond) {
        this.CartaCond = CartaCond;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Date getDatNasc() {
        return datNasc;
    }

    public void setDatNasc(Date datNasc) {
        this.datNasc = datNasc;
    }

    public Date getDatCastro() {
        return datCastro;
    }

    public void setDatCastro(Date datCastro) {
        this.datCastro = datCastro;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Date getDatCargo() {
        return datCargo;
    }

    public void setDatCargo(Date datCargo) {
        this.datCargo = datCargo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.idAssociadoT;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AssocTaxista other = (AssocTaxista) obj;
        if (this.idAssociadoT != other.idAssociadoT) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AssocTaxista{" + "idAssociadoT=" + idAssociadoT + '}';
    }
    
    
    
}
