package machine;

public class Latte extends Coffee {
    // One cup of latte needs: 350 ml of water, 75 ml of milk, 20 g of coffee beans
    private int mlOfWaterRequiredForOneCup = 350;
    private int mlOfMilkRequiredForOneCup = 75;
    private int gOfCoffeeRequiredForOneCup = 20;
    private int price = 7;

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
