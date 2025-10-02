package scu.edu.csen160.lab2.test;

import scu.edu.csen160.lab2.test.exercise1.Q1;
import scu.edu.csen160.lab2.test.exercise2.Q2;
import scu.edu.csen160.lab2.test.exercise3.Q3;
import scu.edu.csen160.lab2.test.exercise4.Q4;
import scu.edu.csen160.lab2.test.exercise5.Q5Circle;
import scu.edu.csen160.lab2.test.exercise5.Q5Rectangle;

// Uncomment the lines as you compile each of the exercises.
public class main {
    public static void main(String[] args) {
        Q1.q1();
        Q2.q2();
        Q3.q3();
        Q4.q4();
//
        Q5Circle circ=new Q5Circle(10.0);
        Q5Rectangle rect=new Q5Rectangle(10.0, 20.0);
        System.out.println("Circle area="+circ.area());
        System.out.println("Rectangle area="+rect.area());
    }
}