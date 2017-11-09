package be.cegeka.cleancode.application;

import be.cegeka.cleancode.Domain.Cards.LoyaltyCard;
import be.cegeka.cleancode.Domain.Cards.LoyaltyCardService;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

public class LoyaltyCardControllerTest {
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @InjectMocks
    private LoyaltyCardController loyaltyCardController;

    @Mock
    private LoyaltyCardService loyaltyCardService;

    @Test
    public void whenGivenNewCustomer_shouldCallCustomerService() throws Exception {
        loyaltyCardController.addLoyaltyCard("12589", 2);
        verify(loyaltyCardService).addLoyaltyCard("12589", 2);
    }
}