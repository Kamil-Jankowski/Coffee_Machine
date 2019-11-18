package machine;

class Coffee {
    // One cup of coffee needs: 200 ml of water, 50 ml of milk, 15 g of coffee beans
    public final int ML_OF_WATER_REQUIRED_FOR_ONE_CUP = 200;
    public final int ML_OF_MILK_REQUIRED_FOR_ONE_CUP = 50;
    public final int G_OF_COFFEE_BEANS_REQUIRED_FOR_ONE_CUP = 15;

    int countAvailableCoffeeCups(int water, int milk, int coffee){
        int partsOfWater = water / ML_OF_WATER_REQUIRED_FOR_ONE_CUP;
        int partsOfMilk = milk / ML_OF_MILK_REQUIRED_FOR_ONE_CUP;
        int partsOfCoffee = coffee / G_OF_COFFEE_BEANS_REQUIRED_FOR_ONE_CUP;
        return Math.min(Math.min(partsOfWater, partsOfMilk), partsOfCoffee);
    }
}
