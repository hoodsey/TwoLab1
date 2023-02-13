public class Main {
    public static void main(String[] args) {// объявление стоимости билета
        double cost = 7890.99;// количетсво рублей для одной бонусной мили
        int rubOneMile = 20;
        int bonusMile = (int) cost / rubOneMile;// Рассчёт количества бонусных миль

        System.out.println(bonusMile + " - Количество бонусных миль."); // вывод реузльтата

    }
}