package org.example.terminal;

import org.example.money.Money;
import org.example.point.Point;

public class Terminal {
    private int ID;
    private Point location;
    private Money money;

    public Terminal(int ID, Point location, Money money) {
        this.ID = ID;
        this.location = location;
        this.money = money;
    }

    public Terminal() {
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Point getLocation() {
        return location;
    }

    public void setLocation(Point location) {
        this.location = location;
    }

    public Money getMoney() {
        return money;
    }

    public void setMoney(Money money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Terminal{" +
                "ID=" + ID +
                ", location=" + location +
                ", money=" + money +
                '}';
    }
}