package machine;

public enum CoffeeSelection {
    ESPRESSO(new Espresso(250, 0, 16, 4)),
    CAPPUCCINO(new Cappuccino(200, 100, 12, 6)),
    LATTE(new Latte(350, 75, 20, 7));

    private final Coffee coffee;

    CoffeeSelection(Coffee coffee) {
        this.coffee = coffee;
    }

    public Coffee getCoffee() {
        return coffee;
    }
}
