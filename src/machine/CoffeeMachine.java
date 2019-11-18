package machine;

import java.util.Scanner;

public class CoffeeMachine {

    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        Scanner scanner = new Scanner(System.in);
        int cupsOfCoffee;
        int mlOfWater;
        int mlOfMilk;
        int gOfCoffeeBeans;
        int availableAmountOfCoffeeCups;

        System.out.println("Write how many ml of water the coffee machine has: ");
        mlOfWater = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        mlOfMilk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        gOfCoffeeBeans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        cupsOfCoffee = scanner.nextInt();

        availableAmountOfCoffeeCups = coffee.countAvailableCoffeeCups(mlOfWater, mlOfMilk, gOfCoffeeBeans);

        if(availableAmountOfCoffeeCups == cupsOfCoffee){
            System.out.println("Yes, I can make that amount of coffee");
        } else if (availableAmountOfCoffeeCups > cupsOfCoffee){
            int reserve = availableAmountOfCoffeeCups - cupsOfCoffee;
            System.out.printf("Yes, I can make that amount of coffee (and even %d more than that)", reserve);
        } else {
            System.out.printf("No, I can make only %d cup(s) of coffee", availableAmountOfCoffeeCups);
        }
    }
}
