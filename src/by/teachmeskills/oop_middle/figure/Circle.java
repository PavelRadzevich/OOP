package by.teachmeskills.oop_middle.figure;

public class Circle extends Figure {
    private final double radiusC;

    public Circle(double radiusC) {
        this.radiusC = radiusC;
    }

    @Override
    public double getArea() {
        return Math.PI * this.radiusC * this.radiusC;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * this.radiusC;
    }

    @Override
    public String toString() {
        return "Circle {radiusC=" + radiusC + '}';
    }
}
