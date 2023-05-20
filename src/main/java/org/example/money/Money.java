package org.example.money;

public class Money {
    private int cash;

    public Money() {
    }

    public Money(int cash) {
        this.cash = cash;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    @Override
    public String toString() {
        return "Money{" +
                "cash=" + cash +
                '}';
    }
}
