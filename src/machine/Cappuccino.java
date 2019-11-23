package machine;

class Cappuccino extends Coffee {
    // One cup of cappuccino needs: 200 ml of water, 100 ml of milk, 12 g of coffee beans
    private int mlOfWaterRequiredForOneCup = 200;
    private int mlOfMilkRequiredForOneCup = 100;
    private int gOfCoffeeRequiredForOneCup = 12;
    private int price = 6;

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
