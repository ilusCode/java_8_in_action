package main.model;

import java.util.Currency;

/**
 * en esta clase se encuentra la estructura de transactionModel
 */
public class transactionModel {
    int price;
    Currency currency;

    public transactionModel(int price, Currency currency) {
        this.price = price;
        this.currency = currency;
    }

    public transactionModel() {
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
