package machine;

import java.util.Scanner;

public class CoffeeMachine {

    private static int water = 400;
    private static int milk = 540;
    private static int beans = 120;
    private static int cups = 9;
    private static int money = 550;


    public static void main(String[] args) {


        boolean iWantBuyCoffee = true;

        do {
            System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
            Scanner scanner = new Scanner(System.in);
            String action = scanner.next();
            switch (action) {
                case "buy":
                    System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String drinkChoice = scanner.next();
                    switch (drinkChoice) {
                        case "1":
                            if (water >= 250 & beans >= 16 & cups >= 1) {
                                System.out.println("I have enough resources, making you a coffee!\n");
                            }
                            if (water >= 250) {
                                water -= 250;
                            } else {
                                System.out.println("Sorry, not enough water!");
                                break;
                            }
                            if (beans >= 16) {
                                beans -= 16;
                            } else {
                                System.out.println("Sorry, not enough beans!");
                            }
                            if (cups >= 1) {
                                cups--;
                            } else {
                                System.out.println("Sorry, not enough cups!");
                            }
                            money += 4;
                            break;
                        case "2":
                            if (water >= 350 & milk >= 75 & beans >= 20 & cups >= 1) {
                                System.out.println("I have enough resources, making you a coffee!\n");
                            }
                            if (water >= 350) {
                                water -= 350;
                            } else {
                                System.out.println("Sorry, not enough water!");
                                break;
                            }
                            if (milk >= 75) {
                                milk -= 75;
                            } else {
                                System.out.println("Sorry, not enough milk!");
                            }
                            if (beans >= 20) {
                                beans -= 20;
                            } else {
                                System.out.println("Sorry, not enough beans!");
                            }
                            if (cups >= 1) {
                                cups--;
                            } else {
                                System.out.println("Sorry, not enough cups!");
                            }
                            money += 7;
                            break;
                        case "3":
                            if (water >= 200 & milk >= 100 & beans >= 12 & cups >= 1) {
                                System.out.println("I have enough resources, making you a coffee!\n");
                            }
                            if (water >= 200) {
                                water -= 200;
                            } else {
                                System.out.println("Sorry, not enough water!");
                            }
                            if (milk >= 100) {
                                milk -= 100;
                            } else {
                                System.out.println("Sorry, not enough milk!");
                            }
                            if (beans >= 12) {
                                beans -= 12;
                            } else {
                                System.out.println("Sorry, not enough beans!");
                            }
                            if (cups >= 1) {
                                cups--;
                            } else {
                                System.out.println("Sorry, not enough cups!");
                            }
                            money += 6;
                            break;
                        case "back":
                            continue;
                    }
                    break;
                case "fill":
                    System.out.println("\nWrite how many ml of water do you want to add: ");
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
                case "remaining":
                    System.out.println("\nThe coffee machine has: \n" + water + " of water \n" + milk +
                            " of milk \n" + beans + " of coffee beans \n" + cups + " of disposable cups \n"
                            + money + " of money");
                    break;
                case "exit":
                    iWantBuyCoffee = false;
                    break;
            }
        } while (iWantBuyCoffee);
    }
}




