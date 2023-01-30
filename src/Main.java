public class Main {
    public static void main(String[] args) {
        int account = 12;
        int deposit = 0;

        int finalAccount;
        int bonus;

        if (deposit > 1_000) {
            bonus = deposit / 100;
        } else {
            bonus = 0;
        }

        finalAccount = account + deposit;
        System.out.println("Итоговый счет:" + finalAccount);
        System.out.println("Начислено бонусных рублей:" + bonus);
    }
}
