package scu.edu.csen160.lab2.test.exercise4;


//package edu.scu.coen160.lab2;
//
public class Q4 {
    public static void q4() {
        // Implement a test where you create three Singleton
        // objects and you prove they are the same
        Singleton instance_1 = Singleton.getInstance();
        Singleton instance_2 = Singleton.getInstance();
        Singleton instance_3 = Singleton.getInstance();

        System.out.println(instance_1);
        System.out.println(instance_2);
        System.out.println(instance_3);

        System.out.println("instance 1 == instance 2: " + (instance_1 == instance_2));
        System.out.println("instance 1 == instance 3: " + (instance_1 == instance_3));
    }
}