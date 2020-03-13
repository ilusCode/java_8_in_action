package main.interfaces;

import main.model.TraderModel;
import main.model.TransactionModel;

import java.util.List;

public interface Transaction {
    boolean loadListMod(List<TransactionModel> list, TraderModel trader, int year, int value);

    void loadData(List<TransactionModel> list);
}
