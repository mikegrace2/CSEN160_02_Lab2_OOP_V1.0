package scu.edu.csen160.lab2.test.exercise5;

abstract class Q5Figure {
    protected double dim1;
    protected double dim2;

    public abstract double area();

    public void showDimensions() {
        System.out.println("Dim1="+this.dim1);
        System.out.println("Dim2="+this.dim2);
    }
}

class Q5Circle extends Q5Figure {
    private Q5Circle() {
        // Not allowed!
    }

    public Q5Circle(double radius) {
        this.dim1=radius;
    }

    public double area() {
        return this.dim1*this.dim1*Math.PI;
    }
}


class Q5Rectangle extends Q5Figure{
    private Q5Rectangle() {
        // Not allowed!
    }

    public Q5Rectangle(double dim1, double dim2) {
        // ToDo: Implement
        // set dim1 and dim2
    }

    public double area() {
        // ToDo: Implement
        // calc area
        return -1;
    }
}


public class Q5 {
    public static void q5() {
        Q5Circle circ=new Q5Circle(10.0);
        Q5Rectangle rect=new Q5Rectangle(10.0, 20.0);
        System.out.println("Circle area="+circ.area());
        System.out.println("Rectangle area="+rect.area());
    }
}
