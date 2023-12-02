package com.rectangle;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(25, 53, 5, 5);
        rectangle.move(3,2);

        Point point = new Point(3, 2);
        boolean contains = rectangle.containsPoint(point);

        System.out.println(rectangle.equals(rectangle));
        System.out.println();





    }
}
