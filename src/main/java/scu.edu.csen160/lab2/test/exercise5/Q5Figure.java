package scu.edu.csen160.lab2.test.exercise5;

public abstract class Q5Figure {
    protected double dim1;
    protected double dim2;

    public abstract double area();

    public void showDimensions() {
        System.out.println("Dim1="+this.dim1);
        System.out.println("Dim2="+this.dim2);
    }
}

