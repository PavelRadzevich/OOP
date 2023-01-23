package by.teachmeskills.oop_middle.figure;

public class Rectangle extends Figure {
    private final double sideA;
    private final double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double getArea() {
        return this.sideA * this.sideB;
    }

    @Override
    public double getPerimeter() {
        return (this.sideA + this.sideB) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle {" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }
}
