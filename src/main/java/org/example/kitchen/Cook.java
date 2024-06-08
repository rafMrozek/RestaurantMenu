package org.example.kitchen;

import org.example.ConsoleHelper;

import java.util.Observable;
import java.util.Observer;

public class Cook extends Observable implements Observer {
    private final String name;
    public Cook(String name) {
        this.name = name;
    }
    @Override
    public void update(Observable o, Object order) {
        ConsoleHelper.writeMessage("Start gotowania - " + order);
        setChanged();
        notifyObservers(order);
    }
    @Override
    public String toString() {

        return name;
    }
}

