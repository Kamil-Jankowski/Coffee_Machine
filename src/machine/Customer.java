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

    void buy(String variant){
        switch (variant){
            case "1":
                coffee = CoffeeSelection.ESPRESSO.getCoffee();
                break;
            case "2":
                coffee = CoffeeSelection.LATTE.getCoffee();
                break;
            case "3":
                coffee = CoffeeSelection.CAPPUCCINO.getCoffee();
                break;
            case "back":
                // return to main menu
                break;
            default:
                System.out.println("No correct selection made.\n");
                // return to main menu
        }
        if (coffee != null){
            try{
                coffeeMaker.makeCoffee(coffee);
            } catch (InterruptedException ex) {ex.printStackTrace();}
        }
    }
}
