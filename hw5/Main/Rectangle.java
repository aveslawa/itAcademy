package Main;

/**
 * Created by Viachaslau on 2/26/2017.
 */

public class Rectangle {
    private Point cornerUpLeft;
    private Point cornerLowRight;


    public Rectangle(Point cornerUpLeft, Point cornerLowRight) {

        this.cornerUpLeft = cornerUpLeft;
        this.cornerLowRight = cornerLowRight;

    }


    public double calcOfArea() {
        Point cornerLowLeft = new Point(this.cornerLowRight.getX(), this.cornerUpLeft.getY());
        Point cornerUpRight = new Point(this.cornerUpLeft.getX(), this.cornerLowRight.getY());

        return (cornerLowRight.distance(cornerLowLeft, cornerUpLeft) *
                cornerUpLeft.distance(cornerUpRight, cornerLowRight));
        //здесь я уже запутался в том, как правильно сделать. И по синтаксису - также не правльно переность?
    }

    public double calcOfDiagonal() {
        return this.cornerLowRight.distance(cornerLowRight, cornerUpLeft);

    }

}


