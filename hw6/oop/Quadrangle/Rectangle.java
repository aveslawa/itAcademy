package oop.Quadrangle;

import oop.Quadrangle.Quadrangle;

/**
 * Created by Viachaslau.
 */
public class Rectangle extends Parallelogram {
    public Rectangle(double sideAB, double sideBC, double sideCD, double sideAD) {
        super(sideAB, sideBC, sideCD, sideAD);

    }

    @Override
    public double calcArea() {
        double result = getSideAB()*getSideBC();
        return result;
    }

    @Override
    public boolean equalAreas() {
        return super.equalAreas();
    }

    @Override
    public double perimeterOfQuadrangle() {
        return super.perimeterOfQuadrangle();
    }

    @Override
    public double calcDiagonal() {
        return super.calcDiagonal();
    }

    @Override
    public double calcArea(double sideAB, double sideBC, double sideCD, double sideAD, double halfPerimeterOfQuadrangl) {
        return super.calcArea(sideAB, sideBC, sideCD, sideAD, halfPerimeterOfQuadrangl);
    }

}
