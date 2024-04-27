package org.example.kitchen;

public enum Dish {
    Ryba,
    Stek,
    Zupa,
    Sok,
    Woda;

    public static String allDishesToString() {
        String result = "";

        for (Dish dish : Dish.values()) {
            if ("".equals(result)) {
                result += dish.name();
            } else {
                result += ", " + dish.name();
            }
        }
        return result;
    }

}
