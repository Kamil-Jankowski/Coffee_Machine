package machine;

class CoffeeMaker {
    Stock stock = new Stock(1200, 540, 120, 9);
    Moneybox cash = new Moneybox(550);

    void makeCoffee(Coffee coffee) {
        stock.setMlOfWater(stock.getMlOfWater() - coffee.getMlOfWaterRequiredForOneCup());
        stock.setMlOfMilk(stock.getMlOfMilk() - coffee.getMlOfMilkRequiredForOneCup());
        stock.setgOfCoffeeBeans(stock.getgOfCoffeeBeans() - coffee.getGOfCoffeeRequiredForOneCup());
        stock.setDisposableCups(stock.getDisposableCups() - 1);
        cash.setMoney(cash.getMoney() + coffee.getPrice());
    }
}
