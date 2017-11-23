package com.cuwong.designpattern;

/**
 * Created by WongCU on 2017/11/23.
 */
public class App {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape(ShapeFactory.CIRCLE);
        circle.draw();

        Shape rectangle = shapeFactory.getShape(ShapeFactory.RECTANGLE);
        rectangle.draw();

        Shape square = shapeFactory.getShape(ShapeFactory.SQUARE);
        square.draw();
    }
}
