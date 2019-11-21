package machine;

abstract class Coffee {

    int mlOfWaterRequiredForOneCup;
    int mlOfMilkRequiredForOneCup;
    int gOfCoffeeRequiredForOneCup;
    int price;

    abstract int countAvailableCoffeeCups(int water, int milk, int coffee);

    abstract int getMlOfWaterRequiredForOneCup();

    abstract int getMlOfMilkRequiredForOneCup();

    abstract int getGOfCoffeeRequiredForOneCup();

    abstract int getPrice();

}
