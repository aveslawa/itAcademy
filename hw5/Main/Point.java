package Main;

/**
 * Created by Viachaslau on 2/26/2017.
 */
public class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;

    }

    public double getX() {
        return x;

    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;

    }

    public void setY(double y) {
        this.y = y;
    }


    public double distance(Point point0, Point point) {

        double distance = Math.sqrt(Math.pow((point.x - point0.x), 2) + Math.pow((point.y - point0.y), 2));
        return distance;

    }

}


