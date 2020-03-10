package main.data;

import main.interfaces.Dish;
import main.model.DishModel;

import java.util.List;

public class DishData implements Dish {

    @Override
    public boolean loadListMod(List<DishModel> list, int calories, String name) {
        DishModel d = new DishModel();
        d.setCalories(calories);
        d.setName(name);
        return list.add(d);
    }

    @Override
    public void loadData(List<DishModel> list) {
        loadListMod(list, 200, "a");
        loadListMod(list, 300, "b");
        loadListMod(list, 600, "c");
        loadListMod(list, 240, "as");
        loadListMod(list, 900, "qw");
    }
}
