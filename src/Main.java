public class Main {
    public static void main(String[] args) {
        int accountBalance = 1000;
        int bonus;
        int amount;
        amount = 1100;
        if (amount > accountBalance) {
            bonus = amount / 100;
        } else{
            bonus = 0;
        }

        System.out.println(bonus);
    }
}