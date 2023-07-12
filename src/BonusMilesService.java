public class BonusMilesService {

    public int bonus(int price, int translator) {

        int bonusMiles = price / translator;

        return bonusMiles;

    }
}
