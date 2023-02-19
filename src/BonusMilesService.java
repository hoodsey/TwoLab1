public class BonusMilesService {

    public int calculate(int cost) {
        int rubOneMile = 20;
        int result = (int) cost / rubOneMile;// Рассчёт количества бонусных миль
        return result;
    }
}
