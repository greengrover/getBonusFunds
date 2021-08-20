public class Main {
    public static void main(String[] args) {
        int count = 500;
        int transfer = 501;
        int totalCount = count + transfer;
        int totalBonus;

        if (totalCount > 1000) {
            totalBonus = totalCount / 100;

        } else {
            totalBonus = 0;

        }
        System.out.println("Баланс: " + totalCount);
        System.out.println("Итого бонусов: " + totalBonus);
        System.out.println("Итоговый баланс счета с бонусами: " + (totalCount + totalBonus));
    }
}
