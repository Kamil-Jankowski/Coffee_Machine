package machine;

class Customer {
    private CoffeeMaker coffeeMaker;
    private Coffee coffee;

    Customer(CoffeeMaker machine) {
        this.coffeeMaker = machine;
    }

    public Coffee getCoffee() {
        return coffee;
    }

    public void setCoffee(Coffee coffee) {
        this.coffee = coffee;
    }

    void buy(int variant){
        switch (variant){
            case 1:
                coffee = new Espresso();
                break;
            case 2:
                coffee = new Latte();
                break;
            case 3:
                coffee = new Cappuccino();
                break;
            default:
                System.out.println("Coffee unavailable. No correct selection made.");
        }
        coffeeMaker.makeCoffee(coffee);
    }
}
