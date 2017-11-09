package be.cegeka.cleancode.Domain.Cards;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

public class LoyaltyCardServiceTest {

    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private LoyaltyCardService loyaltyCardService;

    @Mock
    private LoyaltyCardRepository loyaltyCardRepository;

    @Test
    public void whenGivenCustomer_shouldGoToCustomerRepository() throws Exception {
        LoyaltyCard loyaltyCard = new LoyaltyCard("12589",0);

       loyaltyCardService.addLoyaltyCard("12589",0);
        verify(loyaltyCardRepository).addLoyaltyCard(loyaltyCard);
    }

}