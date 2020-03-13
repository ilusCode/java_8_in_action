package main.data;

import main.interfaces.Dish;
import main.model.DishModel;

import java.util.List;

import static main.model.DishModel.Type.OTHER;

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
        loadListMod(list, 800, false, "pork", DishModel.Type.MEAT);
        loadListMod(list, 700, true, "beef", DishModel.Type.MEAT);
        loadListMod(list, 400, false, "chicken", DishModel.Type.MEAT);
        loadListMod(list, 530, true, "french fries", OTHER);
        loadListMod(list, 350, true, "rice", OTHER);
        loadListMod(list, 120, true, "season fruit", OTHER);
        loadListMod(list, 550, true, "pizza", OTHER);
        loadListMod(list, 300, false, "prawns", DishModel.Type.FISH);
        loadListMod(list, 450, false, "salmon", DishModel.Type.FISH);
    }
}
