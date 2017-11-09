package be.cegeka.cleancode.application;

import be.cegeka.cleancode.Domain.Customers.CustomerService;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import static org.mockito.Mockito.verify;

public class CustomerControllerTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private CustomerController customerController;

    @Mock
    private CustomerService customerService;

    @Test
    public void whenGivenNewCustomer_shouldCallCustomerService() throws Exception {
        customerController.addCustomer("Domien");
        verify(customerService).addCustomer("Domien");
    }
    @Test
    public void addingLoyaltyCardToCustomer() throws Exception {

    }
}