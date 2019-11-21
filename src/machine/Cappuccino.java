package machine;

public class Cappuccino extends Coffee {
    // One cup of cappuccino needs: 200 ml of water, 100 ml of milk, 12 g of coffee beans
    private int mlOfWaterRequiredForOneCup = 200;
    private int mlOfMilkRequiredForOneCup = 100;
    private int gOfCoffeeRequiredForOneCup = 12;
    private int price = 6;

    @Override
    public int countAvailableCoffeeCups(int water, int milk, int coffee) {
        int partsOfWater = water / mlOfWaterRequiredForOneCup;
        int partsOfMilk = milk / mlOfMilkRequiredForOneCup;
        int partsOfCoffee = coffee / gOfCoffeeRequiredForOneCup;
        return Math.min(Math.min(partsOfWater, partsOfMilk), partsOfCoffee);
    }

    @Override
    int getMlOfWaterRequiredForOneCup() {
        return mlOfWaterRequiredForOneCup;
    }

    @Override
    int getMlOfMilkRequiredForOneCup() {
        return mlOfMilkRequiredForOneCup;
    }

    @Override
    int getGOfCoffeeRequiredForOneCup() {
        return gOfCoffeeRequiredForOneCup;
    }

    @Override
    int getPrice() {
        return price;
    }
}
