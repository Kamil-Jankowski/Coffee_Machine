package machine;

import java.util.Scanner;

public class CoffeeMachine {
    private static final int ML_OF_WATER_REQUIRED_FOR_ONE_CUP = 200;
    private static final int ML_OF_MILK_REQUIRED_FOR_ONE_CUP = 50;
    private static final int G_OF_COFFEE_BEANS_REQUIRED_FOR_ONE_CUP = 15;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cupsOfCoffee;
        int mlOfWater;
        int mlOfMilk;
        int gOfCoffeeBeans;

        System.out.println("Write how many cups of coffee you will need: ");
        cupsOfCoffee = scanner.nextInt();
        // One cup of coffee needs: 200 ml of water, 50 ml of milk, 15 g of coffee beans

        mlOfWater = cupsOfCoffee * ML_OF_WATER_REQUIRED_FOR_ONE_CUP;
        mlOfMilk = cupsOfCoffee * ML_OF_MILK_REQUIRED_FOR_ONE_CUP;
        gOfCoffeeBeans = cupsOfCoffee * G_OF_COFFEE_BEANS_REQUIRED_FOR_ONE_CUP;

        System.out.printf("For %d cups of coffee you will need:\n" +
                "%d ml of water\n" +
                "%d ml of milk\n" +
                "%d g of coffee beans\n", cupsOfCoffee, mlOfWater, mlOfMilk, gOfCoffeeBeans);
    }
}
