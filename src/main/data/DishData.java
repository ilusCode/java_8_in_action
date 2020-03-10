package main.data;

import main.interfaces.Dish;
import main.model.DishModel;

import java.util.List;

public class DishData implements Dish {

    @Override
    public boolean loadListMod(List<DishModel> list, int calories, boolean vegetarian, String name, DishModel.Type type) {
        DishModel d = new DishModel();
        d.setCalories(calories);
        d.setVegetarian(vegetarian);
        d.setName(name);
        d.setType(type);
        return list.add(d);
    }

    @Override
    public void loadData(List<DishModel> list) {
        loadListMod(list, 200, false, "a", DishModel.Type.FISH);
        loadListMod(list, 300, true, "b", DishModel.Type.MEAT);
        loadListMod(list, 60, true, "c", DishModel.Type.OTHER);
        loadListMod(list, 240, false, "as", DishModel.Type.MEAT);
        loadListMod(list, 900, true, "qw", DishModel.Type.FISH);
    }
}
