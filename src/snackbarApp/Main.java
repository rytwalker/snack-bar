package snackbarApp;

public class Main {
    public static void main(String[] args) {
        // init two customers
        Customer jane = new Customer("Jane", 45.25);
        Customer bob = new Customer("Bob", 33.14);

        // init three vending machines
        VendingMachine food = new VendingMachine("Food");
        VendingMachine drink = new VendingMachine("Drink");
        VendingMachine office = new VendingMachine("Office");

        // init stacks
        Snack chips = new Snack("Chips", 36, 1.75, food.getId());
        Snack chocolateBar = new Snack("Chocolate Bar", 36, 1.00, food.getId());
        Snack pretzel = new Snack("Pretzel", 30, 2.00, food.getId());
        Snack soda = new Snack("Soda", 24, 2.50, drink.getId());
        Snack water = new Snack("Water", 20, 2.75, drink.getId());

        double transactionOneCost = soda.getTotalCost(3);
        boolean buySuccess = jane.buy(transactionOneCost);
        if (buySuccess) {
            soda.buySnack(3);
        }

        System.out.println("Transaction 1: \n");
        System.out.println(jane.getName() + " cash: ");
        System.out.println(jane.getCashOnHand());
        System.out.println(soda.getName() + " quantity: ");
        System.out.println(soda.getQuantity());

        double transactionTwoCost = pretzel.getTotalCost(1);
        buySuccess = jane.buy(transactionTwoCost);
        if (buySuccess) {
            pretzel.buySnack(1);
        }
        System.out.println("Transaction 2: ");
        System.out.println(jane.getName() + " cash: ");
        System.out.println(jane.getCashOnHand());
        System.out.println(pretzel.getName() + " quantity: ");
        System.out.println(pretzel.getQuantity());

        double transactionThreeCost = soda.getTotalCost(2);
        buySuccess = bob.buy(transactionThreeCost);
        if (buySuccess) {
            soda.buySnack(2);
        }
        System.out.println("Transaction 3: ");
        System.out.println(bob.getName() + " cash: ");
        System.out.println(bob.getCashOnHand());
        System.out.println(soda.getName() + " quantity: ");
        System.out.println(soda.getQuantity());

        jane.addCash(10.0);
        System.out.println("Jane found $10! cash: ");
        System.out.println(jane.getCashOnHand());

        double transactionFourCost = chocolateBar.getTotalCost(1);
        buySuccess = jane.buy(transactionFourCost);
        if (buySuccess) {
            chocolateBar.buySnack(1);
        }
        System.out.println("Transaction 4: ");
        System.out.println(jane.getName() + " cash: ");
        System.out.println(jane.getCashOnHand());
        System.out.println(chocolateBar.getName() + " quantity: ");
        System.out.println(chocolateBar.getQuantity());

        pretzel.addQuantity(12);
        System.out.println(pretzel.getName() + " quantity: ");
        System.out.println(pretzel.getQuantity());

        double transactionFiveCost = pretzel.getTotalCost(3);
        buySuccess = bob.buy(transactionFiveCost);
        if (buySuccess) {
            pretzel.buySnack(3);
        }
        System.out.println("Transaction 5: ");
        System.out.println(bob.getName() + " cash: ");
        System.out.println(bob.getCashOnHand());
        System.out.println(pretzel.getName() + " quantity: ");
        System.out.println(pretzel.getQuantity());

    }
}