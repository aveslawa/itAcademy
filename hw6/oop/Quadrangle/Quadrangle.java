package oop.Quadrangle;

import oop.Polygon;

/**
 * Created by Viachaslau.
 */
public abstract class Quadrangle extends Polygon implements AddingForQuadrangle {
    private double sideAB;
    private double sideBC;
    private double sideCD;
    private double sideAD;

    public Quadrangle(double sideAB, double sideBC, double sideCD, double sideAD) {
        this.sideAB = sideAB;
        this.sideBC = sideBC;
        this.sideCD = sideCD;
        this.sideAD = sideAD;
    }

    public double getSideAB() {
        return sideAB;
    }

    public double getSideBC() {
        return sideBC;
    }

    public double getSideCD() {
        return sideCD;
    }

    public double getSideAD() {
        return sideAD;
    }

    @Override
    public double perimeterOfQuadrangle() {
        double result = sideAB + sideBC + sideCD + sideAD;
        return result;
    }

    @Override
    public double calcDiagonal() {
        return 0;
    }

    public double calcArea(double sideAB, double sideBC, double sideCD, double sideAD, double halfPerimeterOfQuadrangl) {
        double result = Math.sqrt((halfPerimeterOfQuadrangl - sideAB) * (halfPerimeterOfQuadrangl - sideBC) * (halfPerimeterOfQuadrangl - sideCD) * (halfPerimeterOfQuadrangl - sideAD));
        return result;
    }

}
