package main.model;

/**
 * en esta clase se encuentra la estructura de appleModel
 */
public class appleModel {
    private Integer weight;
    private String color;
    private Integer piece;

    public appleModel() {
        this.weight = 0;
        this.color = "";
        this.piece = 0;
    }

    public appleModel(Integer weight, String color, int piece) {
        this.weight = weight;
        this.color = color;
        this.piece = piece;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPiece() {
        return piece;
    }

    public void setPiece(Integer piece) {
        this.piece = piece;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }
}
