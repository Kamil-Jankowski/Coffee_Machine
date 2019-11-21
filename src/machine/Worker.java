package machine;

public class Worker {
    Stock stock;
    Moneybox cash;

    Worker(Moneybox cash) {
        this.cash = cash;
    }

    Worker(Stock stock) {
        this.stock = stock;
    }

    public void fill(int water, int milk, int coffee, int cups){}

    void take(){}
}
