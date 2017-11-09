package be.cegeka.cleancode.application;

import be.cegeka.cleancode.Domain.Cards.LoyaltyCardService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import javax.transaction.Transactional;

@RestController
@RequestMapping(path = "/loyaltycard")
@Transactional
public class LoyaltyCardController {

    @Inject
    private LoyaltyCardService loyaltyCardService;

    @PostMapping
    public void addLoyaltyCard(@RequestParam(value = "barCode", required = true) String barCode,
                               @RequestParam(value = "bonusPoints", required = true) int bonusPoints) {
        loyaltyCardService.addLoyaltyCard(barCode,bonusPoints);
    }
}
