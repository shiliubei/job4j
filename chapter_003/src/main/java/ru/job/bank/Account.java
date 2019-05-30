package ru.job.bank;

public class Account {

    private double value;
    private int requisites;

    public Account(double values, int requisites) {
        this.value = values;
        this.requisites = requisites;
    }

    public double getValue(){
        return this.value;
    }

    public int getRequisites(){
        return this.requisites;
    }

    boolean transfer(Account destination, double amount) {
        boolean success = false;
        if (amount > 0 && amount < this.value && destination != null) {
            success = true;
            this.value -= amount;
            destination.value += amount;
        }
        return success;
    }

    

    

}
