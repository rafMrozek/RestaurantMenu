package org.example.kitchen;

public enum Dish {
    Ryba(25),
    Stek(30),
    Zupa(15),
    Sok(5),
    Woda(3);
    private int duration;

    public int getDuration() {
        return duration;
    }

    private Dish(int duration) {
        this.duration = duration;
    }

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
