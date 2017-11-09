package be.cegeka.cleancode.Domain.Customers;

import be.cegeka.cleancode.Domain.Customers.Customer;
import be.cegeka.cleancode.Domain.Customers.CustomerRepository;
import be.cegeka.cleancode.Domain.Customers.CustomerService;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.mockito.Mockito.verify;

public class CustomerServiceTest {

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private CustomerService customerService;

    @Mock
    private CustomerRepository customerRepository;

    @Test
    public void whenGivenCustomer_shouldGoToCustomerRepository() throws Exception {
        Customer customer = new Customer("Domien");

        customerService.addCustomer("Domien");
        verify(customerRepository).addCustomer(customer);
    }

//    @Test
//    public void addingLoyaltyCardToCustomer() throws Exception {
//        customerService.addLoyaltyCardToCustomer(1);
//        verify(customerRepository).addLoyaltyCardToCustomer();
//    }
}