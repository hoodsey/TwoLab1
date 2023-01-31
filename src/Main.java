public class Main {
    public static void main(String[] args) {

        // объявление стоимости билета
        double Cost = 7890.99;
        // количетсво рублей для одной бонусной мили
        int RubOneMile = 20;

        // Рассчёт количества бонусных миль
        int BonusMile = (int)Cost / RubOneMile;
        // вывод реузльтата
        System.out.println(BonusMile  + " - Количество бонусных миль.");

    }
}