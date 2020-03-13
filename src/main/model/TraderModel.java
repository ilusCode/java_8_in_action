package main.model;

public class TraderModel {
    String name;
    String city;

    public TraderModel() {
        this.name = "";
        this.city = "";
    }

    public TraderModel(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String toString() {
        return "Trader:" + this.name + " in " + this.city;
    }
}
