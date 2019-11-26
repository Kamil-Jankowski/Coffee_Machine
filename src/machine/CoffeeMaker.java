package machine;

class CoffeeMaker {
    private Customer customer;
    private Worker worker;

    Stock stock = new Stock(400, 540, 120, 9);
    Moneybox cash = new Moneybox(550);

    private String password = "1234";
    private int water;
    private int milk;
    private int coffeeBeans;
    private int cups;


    boolean runCoffeeMachine(Status status) {
        return status != Status.CLOSING_PROGRAM;
    }

    String runCoffeeMachine(CoffeeMaker machine, Status status, String input){
        switch (status) {
            case BUYING:
                customer = new Customer(machine);
                customer.buy(input);
                break;
            case FILLING_WATER:
                water = Integer.parseInt(input);
                break;
            case FILLING_MILK:
                milk = Integer.parseInt(input);
                break;
            case FILLING_COFFEE:
                coffeeBeans = Integer.parseInt(input);
                break;
            case FILLING_CUPS:
                cups = Integer.parseInt(input);
                worker = new Supplier(machine.stock);
                worker.fill(water, milk, coffeeBeans, cups);
                break;
            case TAKING_MONEY:
                if (password.equals(input)) {
                worker = new Seller(machine.cash);
                worker.take();
                } else {
                    System.out.println("Wrong PIN number");
                }
                break;
            case PRINTING_STATUS:
                if (password.equals(input)) {
                System.out.println();
                System.out.println(machine.stock.toString());
                System.out.println(machine.cash.toString());
                System.out.println();
                } else {
                    System.out.println("Wrong PIN number");
                }
                break;
            case MAIN_SELECTING:
            default:
                return input.toUpperCase();
        }
        return input;
    }

    void makeCoffee(Coffee coffee) throws InterruptedException {
        // if resources are ok:
        if (checkResources(coffee)){
            System.out.println("I have enough resources, making you a coffee!\n");
            stock.setMlOfWater(stock.getMlOfWater() - coffee.getMlOfWaterRequiredForOneCup());
            stock.setMlOfMilk(stock.getMlOfMilk() - coffee.getMlOfMilkRequiredForOneCup());
            stock.setgOfCoffeeBeans(stock.getgOfCoffeeBeans() - coffee.getGOfCoffeeRequiredForOneCup());
            stock.setDisposableCups(stock.getDisposableCups() - 1);
            cash.setMoney(cash.getMoney() + coffee.getPrice());
            Thread.sleep(1000);                             // time needed to prepare coffee
        }
    }

    private boolean checkResources(Coffee coffee){
        if (stock.getMlOfWater() < coffee.getMlOfWaterRequiredForOneCup()){
            System.out.println("Sorry, not enough water!\n");
            return false;
        } else if (stock.getMlOfMilk() < coffee.getMlOfMilkRequiredForOneCup()){
            System.out.println("Sorry, not enough milk!\n");
            return false;
        } else if (stock.getgOfCoffeeBeans() < coffee.getGOfCoffeeRequiredForOneCup()){
            System.out.println("Sorry, not enough coffee!\n");
            return false;
        } else if (stock.getDisposableCups() < 1){
            System.out.println("Sorry, not enough cups!\n");
            return false;
        } else {
            return true;
        }
    }

}
