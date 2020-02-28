package chapter_1.model;

import java.util.Currency;

public class TransactionModel {
    int price;
    Currency currency;

    public TransactionModel(int price, Currency currency) {
        this.price = price;
        this.currency = currency;
    }

    public TransactionModel() {
        this.price = 0;
        this.currency = Currency.getInstance("");
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }
}
