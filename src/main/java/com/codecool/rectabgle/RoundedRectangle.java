package com.codecool.rectabgle;

public class RoundedRectangle extends Rectangle{
    private double roundRadius;

    public RoundedRectangle(double height, double width) {
        super(height, width);
    }

    public RoundedRectangle(double height, double width, double roundRadius) {
        super(height, width);
        this.roundRadius = roundRadius;
    }

    public void setRoundRadius(double roundRadius) {
        this.roundRadius = roundRadius;
    }

    public double getRoundRadius() {
        return roundRadius;
    }

    @Override
    public double calculateArea() {
        return super.calculateArea() - 4*roundRadius * roundRadius + ( 2 * roundRadius * Math.PI );
    }

    @Override
    public String toString() {
        return "RoundedRectangle{ " + "Width=" + getWidth() + ", Height=" + getHeight() + ", RoundRadius=" + roundRadius + " }";
    }

    public void printRoundedRectangle() {
        System.out.println( this.toString() );
    }
}
