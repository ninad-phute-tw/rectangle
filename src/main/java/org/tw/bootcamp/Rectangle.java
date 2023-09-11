package org.tw.bootcamp;

public class Rectangle {

    private final int length;
    private final int breadth;

    public Rectangle(int len, int breadth) {
        this.length = len;
        this.breadth = breadth;
    }

    public double calculateArea() {
        return length * breadth;
    }
}