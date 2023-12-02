package com.rectangle;

import java.util.Objects;

public class Rectangle {
    private double height;
    private double width;
    private int x;
    private int y;

    public Rectangle(double height, double width, int x, int y) {
        this.height = height;
        this.width = width;
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double calculateArea() {
        return x * y;
    }
    public void move(int x, int y) {
        this.x += x;
        this.y += y;
    }

    public boolean containsPoint(Point p) {

        int minX = x - (int) (width / 2);
        int maxX = x + (int) (width / 2);
        int minY = y - (int) (width / 2);
        int maxY = y + (int) (width / 2);

        return p.getX() >= minX && p.getX() <= maxX && p.getY() >= minY && p.getY() <= maxY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(height, rectangle.height) == 0 &&
                Double.compare(width, rectangle.width) == 0 &&
                x == rectangle.x && y == rectangle.y;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "height=" + height +
                ", width=" + width +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
