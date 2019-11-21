package machine;

class Stock {
    Stock(int mlOfWater, int mlOfMilk, int gOfCoffeeBeans, int disposableCups) {
        this.mlOfWater = mlOfWater;
        this.mlOfMilk = mlOfMilk;
        this.gOfCoffeeBeans = gOfCoffeeBeans;
        this.disposableCups = disposableCups;
    }

    private int mlOfWater;
    private int mlOfMilk;
    private int gOfCoffeeBeans;
    private int disposableCups;

    int getMlOfWater() {
        return mlOfWater;
    }

    void setMlOfWater(int mlOfWater) {
        this.mlOfWater = mlOfWater;
    }

    int getMlOfMilk() {
        return mlOfMilk;
    }

    void setMlOfMilk(int mlOfMilk) {
        this.mlOfMilk = mlOfMilk;
    }

    int getgOfCoffeeBeans() {
        return gOfCoffeeBeans;
    }

    void setgOfCoffeeBeans(int gOfCoffeeBeans) {
        this.gOfCoffeeBeans = gOfCoffeeBeans;
    }

    int getDisposableCups() {
        return disposableCups;
    }

    void setDisposableCups(int disposableCups) {
        this.disposableCups = disposableCups;
    }

    @Override
    public String toString() {
        return String.format("The coffee machine has:\n" +
                "%d of water\n" +
                "%d of milk\n" +
                "%d of coffee beans\n" +
                "%d of disposable cups", mlOfWater, mlOfMilk, gOfCoffeeBeans, disposableCups);
    }
}
