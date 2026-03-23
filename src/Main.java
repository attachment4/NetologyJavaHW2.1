public class Main {
    public static void main(String[] args) {

        int refilBalance = 1000;
        int balance = 100;


        int bonusRubRefil;
        if (refilBalance > 1000) {
            bonusRubRefil = refilBalance / 100;
        } else {
            bonusRubRefil = 0;
        }


        int statusBalance = balance + refilBalance + bonusRubRefil;
        System.out.println("Бонусные рубли:" + bonusRubRefil);
        System.out.println("Итоговый счет:" + statusBalance);
    }
}