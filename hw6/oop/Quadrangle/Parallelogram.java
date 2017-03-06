package oop.Quadrangle;

/**
 * Created by Viachaslau.
 */
public class Parallelogram extends Quadrangle {
    public Parallelogram(double sideAB, double sideBC, double sideCD, double sideAD) {
        super(sideAB, sideBC, sideCD, sideAD);
    }

    double AB = getSideAB();
    double BC = getSideBC();
    double CD = AB;
    double AD = BC;


    @Override
    public double calcArea() {
        return super.calcArea();
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
