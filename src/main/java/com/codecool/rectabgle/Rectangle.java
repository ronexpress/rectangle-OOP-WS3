package com.codecool.rectabgle;

public class Rectangle {
    private double height;
    private double width;
    private double size;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public Rectangle(double size){
        this.size = size;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public double getSize() {
        return size;
    }

    public double calculateArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "Rectangle{ " + "height=" + height + ", width=" + width + " }";
    }

    public void printRectangle() {
        System.out.println( this.toString() );
    }
}
