package be.cegeka.cleancode.Domain.Cards;

import javax.persistence.*;

@Entity
@Table(name = "loyaltycards")
public class LoyaltyCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "barcode")
    private String barCode;
    @Column(name = "bonuspoints")
    private int bonusPoints;

    public LoyaltyCard() {
    }

    public LoyaltyCard(String barCode, int bonusPoints) {
        this.barCode = barCode;
        this.bonusPoints = bonusPoints;
    }

    public int getId() {
        return id;
    }

    public String getBarCode() {
        return barCode;
    }

    public int getBonusPoints() {
        return bonusPoints;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LoyaltyCard that = (LoyaltyCard) o;

        if (id != that.id) return false;
        if (bonusPoints != that.bonusPoints) return false;
        return barCode != null ? barCode.equals(that.barCode) : that.barCode == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (barCode != null ? barCode.hashCode() : 0);
        result = 31 * result + bonusPoints;
        return result;
    }
}

