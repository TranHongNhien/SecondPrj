/*
 * @(#) TestRectangle.java     1.0     8/27/2024
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
import java.util.Scanner;

public class TestRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Length: ");
        double length = sc.nextDouble();

        System.out.print("Width: ");
        double width = sc.nextDouble();

        try {
            Rectangle rc = new Rectangle(length, width);
            System.out.println("Area: " + rc.getArea());
            System.out.println("Perimeter: " + rc.getPerimeter());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}

