public class Main {
    public static void main(String[] args) {

        // объявление стоимости билета
        double cost = 7890.99;
        // количетсво рублей для одной бонусной мили
        int rubOneMile = 20;

        // Рассчёт количества бонусных миль
        int bonusMile = (int) cost / rubOneMile;
        // вывод реузльтата
        System.out.println(bonusMile + " - Количество бонусных миль.");

    }
}