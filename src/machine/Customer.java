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
                coffee = new Espresso();
                break;
            case "2":
                coffee = new Latte();
                break;
            case "3":
                coffee = new Cappuccino();
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
