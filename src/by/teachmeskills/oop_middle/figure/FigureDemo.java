package by.teachmeskills.oop_middle.figure;

import java.util.Arrays;

/*
    Написать иерархию классов «Фигуры». Фигура -> Треугольник -> Прямоугольник -> Круг.
    Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет периметра.
    Создать массив из 5 фигур.
    Вывести на экран сумму периметра всех фигур в массиве.
*/
public class FigureDemo {

    public static void main(String[] args) {
        final double SIDE_A = 3;
        final double SIDE_B = 4;
        final double SIDE_C = 5;
        final double RADIUS_C = 10;

        Figure[] figures = {
                new Circle(RADIUS_C),
                new Triangle(SIDE_A, SIDE_B, SIDE_C),
                new Rectangle(SIDE_A, SIDE_B),
                new Rectangle(SIDE_C, SIDE_A)
        };

        System.out.println("The sum of the perimeters of the figures in the array \n\n" + Arrays.toString(figures) +
                "\n\n is:\n\n" + getSumPerimeterFigures(figures));
    }

    private static double getSumPerimeterFigures(Figure[] figures) {
        double sum = 0;
        for (Figure figure : figures) {
            sum += figure.getPerimeter();
        }
        return sum;
    }


}
