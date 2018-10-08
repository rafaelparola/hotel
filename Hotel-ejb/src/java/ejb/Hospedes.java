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
@Table(name = "Hospedes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hospedes.findAll", query = "SELECT h FROM Hospedes h")
    , @NamedQuery(name = "Hospedes.findById", query = "SELECT h FROM Hospedes h WHERE h.id = :id")
    , @NamedQuery(name = "Hospedes.findByNome", query = "SELECT h FROM Hospedes h WHERE h.nome = :nome")
    , @NamedQuery(name = "Hospedes.findByCpf", query = "SELECT h FROM Hospedes h WHERE h.cpf = :cpf")
    , @NamedQuery(name = "Hospedes.findByQuarto", query = "SELECT h FROM Hospedes h WHERE h.quarto = :quarto")
    , @NamedQuery(name = "Hospedes.findByCheckin", query = "SELECT h FROM Hospedes h WHERE h.checkin = :checkin")
    , @NamedQuery(name = "Hospedes.findByCheckout", query = "SELECT h FROM Hospedes h WHERE h.checkout = :checkout")})
public class Hospedes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Size(max = 50)
    @Column(name = "nome")
    private String nome;
    @Size(max = 50)
    @Column(name = "cpf")
    private String cpf;
    @Column(name = "quarto")
    private Integer quarto;
    @Size(max = 100)
    @Column(name = "checkin")
    private String checkin;
    @Size(max = 100)
    @Column(name = "checkout")
    private String checkout;

    public Hospedes() {
    }

    public Hospedes(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getQuarto() {
        return quarto;
    }

    public void setQuarto(Integer quarto) {
        this.quarto = quarto;
    }

    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
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
        if (!(object instanceof Hospedes)) {
            return false;
        }
        Hospedes other = (Hospedes) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ejb.Hospedes[ id=" + id + " ]";
    }
    
}
