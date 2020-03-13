package main.data;

import main.interfaces.Transaction;
import main.model.TraderModel;
import main.model.TransactionModel;

import java.util.List;

public class TransactionData implements Transaction {
    @Override
    public boolean loadListMod(List<TransactionModel> list, TraderModel trader, int year, int value) {
        TransactionModel t = new TransactionModel();
        t.setTrader(trader);
        t.setYear(year);
        t.setValue(value);
        return list.add(t);
    }

    @Override
    public void loadData(List<TransactionModel> list) {
/**
 *         loadListMod(list, brian, 2011, 300);
 *         loadListMod(list, raoul, 2012, 1000);
 *         loadListMod(list, raoul, 2011, 400);
 *         loadListMod(list, mario, 2012, 710);
 *         loadListMod(list, mario, 2012, 700);
 *         loadListMod(list, alan, 2012, 950);
 */
    }
}
