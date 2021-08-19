public class Main {
    public static void main(String[] args) {
        int count = 500;
        int transfer = 200;
        int totalCount = count + transfer;
        int totalBonus = totalCount / 100;

        if (totalCount > 1000) {
            System.out.println("Баланс: " + totalCount);
            System.out.println("Итого бонусов: " + totalBonus);
            System.out.println("Итоговый баланс счета с бонусами: " + (totalCount + totalBonus));
        } else {
            totalBonus = 0;
            System.out.println("Баланс: " + totalCount);
            System.out.println("Итого бонусов: " + totalBonus);
            System.out.println("Итоговый баланс счета с бонусами: " + totalCount);
        }

    }
}
