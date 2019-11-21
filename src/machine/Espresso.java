package machine;

public class Espresso extends Coffee {
    // One cup of espresso needs: 250 ml of water, 0 ml of milk, 16 g of coffee beans
    private int mlOfWaterRequiredForOneCup = 250;
    private int mlOfMilkRequiredForOneCup = 0;
    private int gOfCoffeeRequiredForOneCup = 16;
    private int price = 4;

    @Override
    public int countAvailableCoffeeCups(int water, int milk, int coffee) {
        int partsOfWater = water / mlOfWaterRequiredForOneCup;
        int partsOfCoffee = coffee / gOfCoffeeRequiredForOneCup;
        return Math.min(partsOfWater, partsOfCoffee);
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
