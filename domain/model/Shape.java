package domain.model;

public class Shape{
    private int x;
    private int y;

    Shape() {

    }

    public int calculateArea(){
        return this.x*this.y;
    }
}