package be.cegeka.cleancode.Domain.Customers;

import be.cegeka.cleancode.Domain.Cards.LoyaltyCardRepository;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class CustomerService {

    @Inject
    private CustomerRepository customerRepository;
    @Inject
    private LoyaltyCardRepository loyaltyCardRepository;

    public void addCustomer(String name) {
        customerRepository.addCustomer(new Customer(name));
    }


    public Customer getCustomerById(int id) {
        return customerRepository.getCustomerById(id);
    }

    public void addLoyaltyCardToCustomer(int customerId, int loyaltyCardId) {
        customerRepository.getCustomerById(customerId).setLoyaltyCard(loyaltyCardRepository.getLoyaltyCardById(loyaltyCardId));
    }
}
