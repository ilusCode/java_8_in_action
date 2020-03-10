package main.interfaces;

import main.model.DishModel;

import java.lang.reflect.Type;
import java.util.List;

public interface Dish {

    boolean loadListMod(List<DishModel> list, int calories, boolean vegetarian, String name, DishModel.Type type);

    void loadData(List<DishModel> list);
}
