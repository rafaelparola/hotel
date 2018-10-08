/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejb;

import java.util.List;
import javax.ejb.Stateless;
import javax.ejb.LocalBean;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author rafael
 */
@Stateless
@LocalBean
public class FuncionarioFachada {

    @PersistenceContext(unitName = "Hotel-ejbPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }

    
    public List<ejb.Funcionarios> getListaFuncionarios() {
        Query query = em.createNamedQuery("Clientes.findAll");
        return query.getResultList();
    }
    
    public void insereFuncionarios(String nome, String cpf, String senha) {
        
        Query query = em.createNamedQuery("Clientes.insereFuncionario");
    }
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
