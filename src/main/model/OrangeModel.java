package main.model;

public class OrangeModel extends FruitModel {
    private Integer weight;
    private String color;
    private Integer piece;

    public OrangeModel() {
        this.weight = 0;
        this.color = "";
        this.piece = 0;
    }

    public OrangeModel(Integer weight, String color, Integer piece) {
        this.weight = weight;
        this.color = color;
        this.piece = piece;
    }

    public OrangeModel(String color) {
        this.color = color;
    }

    public OrangeModel(Integer weight) {
        this.weight = weight;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPiece() {
        return piece;
    }

    public void setPiece(Integer piece) {
        this.piece = piece;
    }
}
