package be.cegeka.cleancode.Domain.Customers;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Named
public class CustomerRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void addCustomer(Customer customer) {
        entityManager.persist(customer);
    }

    public Customer getCustomerById(int id) {
        return entityManager.createQuery("select c from Customer c where c.id=:id", Customer.class)
                .setParameter("id", id).getSingleResult();
    }
    
}
