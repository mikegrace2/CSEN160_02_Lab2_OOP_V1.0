package scu.edu.csen160.lab2.test.exercise5;

public class Q5Circle extends Q5Figure {
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