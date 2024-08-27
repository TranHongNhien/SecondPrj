/*
 * @(#) Rectangle.java     1.0     8/27/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved.
 */

package iuh.fit.se;

/*
 * @description
 * @author: Nhien Tran
 * @date:    8/27/2024
 * @version: 1.0
 */
public class Rectangle {
    private double length, width;

    public Rectangle(double l, double w) {
        if(length<0 || width<0)
            throw new java.lang.IllegalArgumentException("Length and width must be greater than 0");
        this.length = l;
        this.width = w;
    }
    public double getArea() {
        return length * width;
    }
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length<0)
            throw new java.lang.IllegalArgumentException("Length must be greater than 0");
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width<0)
            throw new java.lang.IllegalArgumentException("Width must be greater than 0");
        this.width = width;
    }
}