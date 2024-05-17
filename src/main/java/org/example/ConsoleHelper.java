package org.example;

import org.example.kitchen.Dish;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ConsoleHelper {
    private static BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
    public static void writeMessage(String message) {
        System.out.println(message);
    }
    public static String readString() throws IOException {
        return bis.readLine();
    }
    public static List<Dish> getAllDishesForOrder() throws IOException {
        List<Dish> dishes = new ArrayList<>();
        ConsoleHelper.writeMessage("Wybierz posiłek z listy:" + Dish.allDishesToString() + "\n lub wybierz 'exit' aby zakończyć zamówienie");
        while(true) {
            String dishName = ConsoleHelper.readString().trim();
            if ("exit".equals(dishName)) {
                break;
            }
            try {
                Dish dish = Dish.valueOf(dishName);
                dishes.add(dish);
                writeMessage(dishName + " Twoje zamówienie jest zakończone sukcesem");
            } catch (Exception e) {
                writeMessage(dishName + " nie udało się");
            }
        }
        return dishes;
    }
}

