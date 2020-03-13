package main.model;

public class TransactionModel {

    TraderModel trader;
    int year;
    int value;

    public TransactionModel() {
        this.trader = null;
        this.year = 0;
        this.value = 0;
    }

    public TransactionModel(TraderModel trader, int year, int value) {
        this.trader = trader;
        this.year = year;
        this.value = value;
    }

    public TraderModel getTrader() {
        return trader;
    }

    public void setTrader(TraderModel trader) {
        this.trader = trader;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String toString() {
        return "{" + this.trader + ", " +
                "year: " + this.year + ", " + "value:" + this.value + "}";
    }
}
