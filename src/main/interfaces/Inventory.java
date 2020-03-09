package main.interfaces;

import main.model.AppleModel;

import java.util.List;

public interface Inventory {
    boolean loadListMod(List<AppleModel> list, int weight, String color, int pieces);

    void loadData(List<AppleModel> list);
}
