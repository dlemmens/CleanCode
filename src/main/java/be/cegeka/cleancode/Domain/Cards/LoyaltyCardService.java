package be.cegeka.cleancode.Domain.Cards;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class LoyaltyCardService {

    @Inject
    private LoyaltyCardRepository loyaltyCardRepository;


    public void addLoyaltyCard(String barCode, int bonusPoints) {
        loyaltyCardRepository.addLoyaltyCard(new LoyaltyCard(barCode,bonusPoints));
    }
}
