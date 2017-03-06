package oop;


import oop.Quadrangle.Quadrangle;
import oop.Quadrangle.Rectangle;

/**
 * Created by Viachaslau on 3/5/2017.
 */
public class Main {
    public static void main(String[] args) {

        Quadrangle abcd = new Rectangle(10, 5, 10, 5);

        System.out.println(abcd.calcArea());
    }
}
