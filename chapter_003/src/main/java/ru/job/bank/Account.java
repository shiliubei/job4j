package ru.job.bank;

import java.util.Objects;

public class Account {

    private double value;
    private String requisites;

    public Account(double values, String requisites) {
        this.value = values;
        this.requisites = requisites;
    }

    public double getValue() {
        return this.value;
    }

    public String getRequisites() {
        return this.requisites;
    }

    boolean transfer(Account destination, double amount) {
        boolean success = false;
        if (amount > 0 && amount < this.value && destination != null) {
            this.value -= amount;
            destination.value += amount;
            success = true;
        }
        return success;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return requisites.equals(account.requisites);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisites);
    }


}
