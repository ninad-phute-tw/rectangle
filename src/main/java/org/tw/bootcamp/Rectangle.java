package org.tw.bootcamp;

public class Rectangle {

    private final int length;
    private final int breadth;

    public Rectangle(int length, int breadth) {
        if (length <= 0 || breadth <= 0) {
            throw new IllegalArgumentException("Dimension cannot be negative");
        }
        this.length = length;
        this.breadth = breadth;
    }

    public double area() {
        return length * breadth;
    }

    public double perimeter() {
        return 2 * (length + breadth);
    }
}