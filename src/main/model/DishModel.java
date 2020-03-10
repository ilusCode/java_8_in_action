package main.model;

public class DishModel {
    int calories;
    String name;

    public DishModel() {
        this.calories = 0;
        this.name = "";
    }

    public DishModel(int calories, String name) {
        this.calories = calories;
        this.name = name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
