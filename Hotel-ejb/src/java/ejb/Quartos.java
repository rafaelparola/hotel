/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author rafael
 */
@Entity
@Table(name = "Quartos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Quartos.findAll", query = "SELECT q FROM Quartos q")
    , @NamedQuery(name = "Quartos.findById", query = "SELECT q FROM Quartos q WHERE q.id = :id")
    , @NamedQuery(name = "Quartos.findByTipoQuarto", query = "SELECT q FROM Quartos q WHERE q.tipoQuarto = :tipoQuarto")
    , @NamedQuery(name = "Quartos.findByNumero", query = "SELECT q FROM Quartos q WHERE q.numero = :numero")
    , @NamedQuery(name = "Quartos.findByTipoCama", query = "SELECT q FROM Quartos q WHERE q.tipoCama = :tipoCama")
    , @NamedQuery(name = "Quartos.findByCaracteristicas", query = "SELECT q FROM Quartos q WHERE q.caracteristicas = :caracteristicas")
    , @NamedQuery(name = "Quartos.findByValor", query = "SELECT q FROM Quartos q WHERE q.valor = :valor")
    , @NamedQuery(name = "Quartos.findBySenha", query = "SELECT q FROM Quartos q WHERE q.senha = :senha")
    , @NamedQuery(name = "Quartos.findByOcupado", query = "SELECT q FROM Quartos q WHERE q.ocupado = :ocupado")
    , @NamedQuery(name = "Quartos.findByFatura", query = "SELECT q FROM Quartos q WHERE q.fatura = :fatura")})
public class Quartos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Size(max = 50)
    @Column(name = "tipoQuarto")
    private String tipoQuarto;
    @Size(max = 50)
    @Column(name = "numero")
    private String numero;
    @Size(max = 50)
    @Column(name = "tipoCama")
    private String tipoCama;
    @Size(max = 50)
    @Column(name = "caracteristicas")
    private String caracteristicas;
    @Column(name = "valor")
    private Integer valor;
    @Size(max = 100)
    @Column(name = "senha")
    private String senha;
    @Size(max = 1)
    @Column(name = "ocupado")
    private String ocupado;
    @Column(name = "fatura")
    private Integer fatura;

    public Quartos() {
    }

    public Quartos(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipoQuarto() {
        return tipoQuarto;
    }

    public void setTipoQuarto(String tipoQuarto) {
        this.tipoQuarto = tipoQuarto;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipoCama() {
        return tipoCama;
    }

    public void setTipoCama(String tipoCama) {
        this.tipoCama = tipoCama;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(Integer valor) {
        this.valor = valor;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getOcupado() {
        return ocupado;
    }

    public void setOcupado(String ocupado) {
        this.ocupado = ocupado;
    }

    public Integer getFatura() {
        return fatura;
    }

    public void setFatura(Integer fatura) {
        this.fatura = fatura;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Quartos)) {
            return false;
        }
        Quartos other = (Quartos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.Quartos[ id=" + id + " ]";
    }
    
}
