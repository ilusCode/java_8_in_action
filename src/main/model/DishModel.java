package main.model;

public class DishModel {
    int calories;
    boolean vegetarian;
    String name;
    Type type;

    public enum Type {MEAT, FISH, OTHER}

    public DishModel() {
        this.calories = 0;
        this.vegetarian = false;
        this.name = "";
        this.type = null;
    }

    public DishModel(int calories, boolean vegetarian, String name, Type type) {
        this.calories = calories;
        this.vegetarian = vegetarian;
        this.name = name;
        this.type = type;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
