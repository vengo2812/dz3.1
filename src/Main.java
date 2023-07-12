
public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int myBonus = service.bonus(10000, 20);

        System.out.println(myBonus);
    }
}