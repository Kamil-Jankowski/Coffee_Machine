package machine;

public class Moneybox {
    Moneybox(int cash) {
        this.money = cash;
    }

    private int money;

    int getMoney() {
        return money;
    }

    void setMoney(int money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return money + " of money";
    }
}
