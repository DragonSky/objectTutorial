package com.company;


/**
 * Created by stewartpj on 4/11/2014.
 */
public class Rectangle {
    public int width = 0;
    public int height = 0;
    public Point origin;

    // four constructors
    public Rectangle(){
        this(new Point(0, 0));
    }

    public Rectangle(Point p) {
        origin = p;
    }

    public Rectangle(int w, int h){
        this(new Point(0, 0), w, h);
    }

    public Rectangle(Point p, int w, int h){
        origin = p;
        width = w;
        height = h;
    }

    // a method for moving the rectangle
    public void move(int x, int y){
        origin.x = x;
        origin.y = y;
    }

    // a method for computing the area of the rectangel
    public int getArea(){
        return width * height;
    }
}
