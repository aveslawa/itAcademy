package oop.Triangle;

import oop.Polygon;

/**
 * Created by Viachaslau on 3/5/2017.
 */
public abstract class Triangle extends Polygon implements AddingForTriangle {
    private double sideOneOfTriangle;
    private double sideTwoOfTriangle;
    private double sideBaseOfTriangle;

    Triangle(double sideOneOfTriangle, double sideTwoOfTriangle, double sideBaseOfTriangle) {
        this.sideOneOfTriangle = sideOneOfTriangle;
        this.sideTwoOfTriangle = sideTwoOfTriangle;
        this.sideBaseOfTriangle = sideBaseOfTriangle;
    }

    double getSideOneOfTriangle() {
        return sideOneOfTriangle;
    }

    double getSideTwoOfTriangle() {
        return sideTwoOfTriangle;
    }

    double getSideBaseOfTriangle() {
        return sideBaseOfTriangle;
    }

    @Override
    public double halfPerimeterOfTriangle() {
        double halfPerimeterOfTriangle = (sideOneOfTriangle + sideTwoOfTriangle + sideBaseOfTriangle) / 2;
        return halfPerimeterOfTriangle;
    }

    @Override
    public double calcHeight() {
        double height = Math.sqrt(this.halfPerimeterOfTriangle() * (this.halfPerimeterOfTriangle() - sideOneOfTriangle) * (this.halfPerimeterOfTriangle() - sideTwoOfTriangle) * (this.halfPerimeterOfTriangle() - sideBaseOfTriangle)) * (2 / sideBaseOfTriangle);
        return height;
    }

    @Override
    public double calcArea() {
        double calcArea = (1 / 2) * getSideBaseOfTriangle() * calcHeight();
        return calcArea;
    }

}

