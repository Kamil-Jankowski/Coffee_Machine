package machine;

public class Supplier extends Worker {

    Supplier(Stock stock) {
        super(stock);
    }

    @Override
    public void fill(int water, int milk, int coffee, int cups) {
        stock.setMlOfWater(stock.getMlOfWater() + water);
        stock.setMlOfMilk(stock.getMlOfMilk() + milk);
        stock.setgOfCoffeeBeans(stock.getgOfCoffeeBeans() + coffee);
        stock.setDisposableCups(stock.getDisposableCups() + cups);
    }
}
