package machine;

class CoffeeMaker {
    Stock stock = new Stock(400, 540, 120, 9);
    Moneybox cash = new Moneybox(550);

    void makeCoffee(Coffee coffee) throws InterruptedException {
        // if resources are ok:
        if (checkResources(coffee)){
            System.out.println("I have enough resources, making you a coffee!\n");
            stock.setMlOfWater(stock.getMlOfWater() - coffee.getMlOfWaterRequiredForOneCup());
            stock.setMlOfMilk(stock.getMlOfMilk() - coffee.getMlOfMilkRequiredForOneCup());
            stock.setgOfCoffeeBeans(stock.getgOfCoffeeBeans() - coffee.getGOfCoffeeRequiredForOneCup());
            stock.setDisposableCups(stock.getDisposableCups() - 1);
            cash.setMoney(cash.getMoney() + coffee.getPrice());
            Thread.sleep(1000);                             // time needed to prepare coffee
        }
    }

    private boolean checkResources(Coffee coffee){
        if (stock.getMlOfWater() < coffee.getMlOfWaterRequiredForOneCup()){
            System.out.println("Sorry, not enough water!\n");
            return false;
        } else if (stock.getMlOfMilk() < coffee.getMlOfMilkRequiredForOneCup()){
            System.out.println("Sorry, not enough milk!\n");
            return false;
        } else if (stock.getgOfCoffeeBeans() < coffee.getGOfCoffeeRequiredForOneCup()){
            System.out.println("Sorry, not enough coffee!\n");
            return false;
        } else if (stock.getDisposableCups() < 1){
            System.out.println("Sorry, not enough cups!\n");
            return false;
        } else {
            return true;
        }
    }

//    public int countAvailableCoffeeCups(int water, int milk, int coffeeBeans, Coffee coffee) {
//        int partsOfWater = water / coffee.getMlOfWaterRequiredForOneCup();
//        int partsOfMilk = milk / coffee.getMlOfMilkRequiredForOneCup();
//        int partsOfCoffee = coffeeBeans / coffee.getGOfCoffeeRequiredForOneCup();
//        return Math.min(Math.min(partsOfWater, partsOfMilk), partsOfCoffee);
//    }
}
