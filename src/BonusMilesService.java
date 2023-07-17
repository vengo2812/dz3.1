public class BonusMilesService {

    public int calculate(int price) {
        int translator = 20;

        int miles = price / translator;

        return miles;

    }
}
