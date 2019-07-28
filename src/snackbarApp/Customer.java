package snackbarApp;

public class Customer {
    private static int maxId = 0;
    private int id;
    private String name;
    private double cashOnHand;

    public Customer(String name, double cashOnHand) {
        maxId++;
        id = maxId;
        this.name = name;
        this.cashOnHand = cashOnHand;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCashOnHand() {
        return cashOnHand;
    }

    public void addCash(double cash) {
        cashOnHand += cash;
    }

    public boolean buy(double cost) {
        if (cost < cashOnHand) {
            cashOnHand -= cost;
            return true;
        } else {
            return false;
        }
    }
}