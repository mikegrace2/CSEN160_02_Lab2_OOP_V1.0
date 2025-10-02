package scu.edu.csen160.lab2.test.exercise5;

//package edu.scu.coen160.lab2;
//
public class Q5Rectangle extends Q5Figure{
    private Q5Rectangle() {
        // Not allowed!
    }

    public Q5Rectangle(double dim1, double dim2) {
        // ToDo: Implement
        // set dim1 and dim2
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    public double area() {
        // ToDo: Implement
        // calc area
        double area = 0;
        area = dim1*dim2;
        return area;
    }
}