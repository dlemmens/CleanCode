package be.cegeka.cleancode.Domain.Cards;

import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Named
public class LoyaltyCardRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public void addLoyaltyCard(LoyaltyCard loyaltycard) {
        entityManager.persist(loyaltycard);
    }
    public LoyaltyCard getLoyaltyCardById(int id){
        return entityManager.createQuery("select b from LoyaltyCard b where b.id=:id", LoyaltyCard.class)
                .setParameter("id", id).getSingleResult();
    }

}
