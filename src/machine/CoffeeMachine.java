package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        CoffeeMaker machine = new CoffeeMaker();
        Customer customer;
        Worker worker;
        Scanner scanner = new Scanner(System.in);
        String action;
        boolean running = true;

        do {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            action = scanner.nextLine();

            switch (action) {
                case "buy":
                    customer = new Customer(machine);
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    customer.buy(scanner.nextLine());
                    break;

                case "fill":
                    worker = new Supplier(machine.stock);

                    System.out.println("Write how many ml of water do you want to add:");
                    int water = scanner.nextInt();
                    System.out.println("Write how many ml of milk do you want to add:");
                    int milk = scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans do you want to add:");
                    int coffeeBeans = scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee do you want to add:");
                    int cups = scanner.nextInt();

                    worker.fill(water, milk, coffeeBeans, cups);
                    break;

                case "take":
                    worker = new Seller(machine.cash);
                    worker.take();
                    break;

                case "remaining":
                    System.out.println();
                    System.out.println(machine.stock.toString());
                    System.out.println(machine.cash.toString());
                    System.out.println();
                    break;

                case "exit":
                    running = false;
                    break;

                default:
                    System.out.println("No selection made");
            }

        } while (running);
    }
}
