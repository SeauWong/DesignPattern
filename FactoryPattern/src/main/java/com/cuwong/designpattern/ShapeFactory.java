package com.cuwong.designpattern;

/**
 *
 * @author WongCU
 * @date 2017/11/23
 */
public class ShapeFactory {
    public static final String CIRCLE = "1";
    public static final String RECTANGLE = "2";
    public static final String SQUARE = "3";

    public Shape getShape(String shapeType){
        if(CIRCLE.equals(shapeType)){
            return new Circle();
        }
        if(RECTANGLE.equals(shapeType)){
            return new Rectangle();
        }
        if(SQUARE.equals(shapeType)){
            return new Square();
        }
        return null;
    }
}
