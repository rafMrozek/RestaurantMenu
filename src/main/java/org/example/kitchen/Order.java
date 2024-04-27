package org.example.kitchen;
import org.example.ConsoleHelper;
import org.example.Tablet;

import java.io.IOException;
import java.util.List;

public class Order {
    private final Tablet tablet;
    protected List<Dish> dishes;

    public Order (Tablet tablet) throws IOException {
        this.tablet = tablet;
        this.dishes = ConsoleHelper.getAllDishesForOder();
    }
    @Override
    public String toString() {
        String result = "";
        if (dishes.size() == 0) return result;
        result+="Twoje zamówienie: [" + dishes.get(0);
        for (int i = 1; i < dishes.size(); i++) {
            result += ", " + dishes.get(i).name();
        }
        result+="] from " + tablet;
        return result;
    }
}



