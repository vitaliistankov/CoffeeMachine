package machine;

import java.util.Scanner;

public class CoffeeMachine {

    private static int water = 400;
    private static int milk = 540;
    private static int beans = 120;
    private static int cups = 9;
    private static int money = 550;

    public static void main(String[] args) {

        System.out.println("Write action (buy, fill, take, remaining, exit): ");

        Scanner scanner = new Scanner(System.in);

        System.out.println("The coffee machine has: \n" + water + " of water \n" + milk +
                " of milk \n" + beans + " of coffee beans \n" + cups + " of disposable cups \n"
                + money + " of money");

        String action = scanner.nextLine();

        System.out.println(action);

        switch (action) {

            case "buy":

                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");

                int drinkChoice = scanner.nextInt();

                System.out.println(drinkChoice);

                switch (drinkChoice) {
                    case 1:
                        water = water - 250;
                        beans = beans - 16;
                        cups = cups - 1;
                        money = money + 4;
                        break;
                    case 2:
                        water = water - 350;
                        milk = milk - 75;
                        beans = beans - 20;
                        cups = cups - 1;
                        money = money + 7;
                        break;
                    case 3:
                        water = water - 200;
                        milk = milk - 100;
                        beans = beans - 12;
                        cups = cups - 1;
                        money = money + 6;
                        break;
                }

                break;


            case "fill":

                System.out.println("Write how many ml of water do you want to add: ");
                int howManyWaterToAdd = scanner.nextInt();

                water = water + howManyWaterToAdd;

                System.out.println("Write how many ml of milk do you want to add: ");
                int howManyMilkToAdd = scanner.nextInt();

                milk = milk + howManyMilkToAdd;

                System.out.println("Write how many grams of coffee beans do you want to add: ");
                int howManyBeansToAdd = scanner.nextInt();

                beans = beans + howManyBeansToAdd;

                System.out.println("Write how many disposable cups of coffee do you want to add: ");
                int howManyCupsToAdd = scanner.nextInt();

                cups = cups + howManyCupsToAdd;

                break;

            case "take":

                int bank = money;

                System.out.println("I gave you $ " + money);
                money = bank - money;

                break;
        }

        System.out.println("The coffee machine has: \n" + water + " of water \n" + milk +
                " of milk \n" + beans + " of coffee beans \n" + cups + " of disposable cups \n"
                + money + " of money");

//        System.out.println(action);


    }
}




