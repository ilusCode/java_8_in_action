package main.interfaces;

import main.model.DishModel;

import java.util.List;

public interface Dish {
    boolean loadListMod(List<DishModel> list, int calories, String name);

    void loadData(List<DishModel> list);
}
