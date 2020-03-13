package main.data;

import main.interfaces.Trader;
import main.model.TraderModel;

import java.util.List;

public class TraderData implements Trader {

    @Override
    public boolean loadListMod(List<TraderModel> list, String name, String city) {
        TraderModel tm = new TraderModel();
        tm.setCity(city);
        tm.setName(name);
        return list.add(tm);
    }

    @Override
    public void loadData(List<TraderModel> list) {
        loadListMod(list, "Raoul", "Cambridge");
        loadListMod(list, "Mario", "Milan");
        loadListMod(list, "Alan", "Cambridge");
        loadListMod(list, "Brian", "Cambridge");
    }
}
