package machine;

import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {
        CoffeeMaker machine = new CoffeeMaker();
        Scanner scanner = new Scanner(System.in);
        Selection selection;
        boolean running;

        do {
            running = true;
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            try{
                selection = Selection.valueOf(machine.runCoffeeMachine(machine, Status.MAIN_SELECTING, scanner.nextLine()));
                switch (selection) {
                    case BUY:
                        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                        machine.runCoffeeMachine(machine, Status.BUYING, scanner.nextLine());
                        break;

                    case FILL:
                        System.out.println("Write how many ml of water do you want to add:");
                        machine.runCoffeeMachine(machine, Status.FILLING_WATER, scanner.nextLine());
                        System.out.println("Write how many ml of milk do you want to add:");
                        machine.runCoffeeMachine(machine, Status.FILLING_MILK, scanner.nextLine());
                        System.out.println("Write how many grams of coffee beans do you want to add:");
                        machine.runCoffeeMachine(machine, Status.FILLING_COFFEE, scanner.nextLine());
                        System.out.println("Write how many disposable cups of coffee do you want to add:");
                        machine.runCoffeeMachine(machine, Status.FILLING_CUPS, scanner.nextLine());
                        System.out.println();
                        break;

                    case TAKE:
                        System.out.println("Enter pin code: ");
                        machine.runCoffeeMachine(machine, Status.TAKING_MONEY, scanner.nextLine()); // AFTER CHECK CREATE METHOD TO VERIFY PIN CODE
                        break;

                    case REMAINING:
                        System.out.println("Enter pin code: ");
                        machine.runCoffeeMachine(machine, Status.PRINTING_STATUS, scanner.nextLine()); // AFTER CHECK CREATE METHOD TO VERIFY PIN CODE
                        break;

                    case EXIT:
                        running = machine.runCoffeeMachine(Status.CLOSING_PROGRAM);
                        break;

                    default:
                }
            } catch (IllegalArgumentException e){
                System.out.println("Please provide correct action word");
            }
        } while (running);
    }
}
