package machine;

abstract class Coffee {

    private int mlOfWaterRequiredForOneCup;
    private int mlOfMilkRequiredForOneCup;
    private int gOfCoffeeRequiredForOneCup;
    private int price;

    protected Coffee(int water, int milk, int coffee, int price){
        this.mlOfWaterRequiredForOneCup = water;
        this.mlOfMilkRequiredForOneCup = milk;
        this.gOfCoffeeRequiredForOneCup = coffee;
        this.price = price;
    }

    int getMlOfWaterRequiredForOneCup(){
        return mlOfWaterRequiredForOneCup;
    }

    int getMlOfMilkRequiredForOneCup(){
        return mlOfMilkRequiredForOneCup;
    }

    int getGOfCoffeeRequiredForOneCup(){
        return gOfCoffeeRequiredForOneCup;
    }

    int getPrice(){
        return price;
    }

}
