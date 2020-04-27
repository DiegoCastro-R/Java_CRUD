package Model;

import Connection.Connection;
import Model.Fornecedor;

import javax.persistence.EntityManager;

public class FornecedorDAO {
    public Fornecedor save(Fornecedor fornecedor){
        EntityManager em = new Connection().getConnection();

        try{
            em.getTransaction().begin();
            em.persist(fornecedor);
            em.getTransaction().commit();
        } catch (Exception e){
            em.getTransaction().rollback();
        } finally {
            em.close();
        }

        return null;
    }
}
