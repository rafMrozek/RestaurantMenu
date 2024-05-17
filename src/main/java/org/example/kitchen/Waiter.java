package org.example.kitchen;
import org.example.ConsoleHelper;

import java.util.Observer;
import java.util.Observable;

public class Waiter implements Observer {
    @Override
    public void update(Observable cook, Object order) {
        ConsoleHelper.writeMessage(order + " zostało przyrządzone przez " + cook);
    }
}
