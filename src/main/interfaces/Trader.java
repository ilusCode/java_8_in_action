package main.interfaces;


import main.model.TraderModel;

import java.util.List;

public interface Trader {
    boolean loadListMod(List<TraderModel> list, String name, String app);

    void loadData(List<TraderModel> list);
}
