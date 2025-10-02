package scu.edu.csen160.lab2.test.exercise4;

class Singleton {
    // Static variable reference of single_instance
    // of type Singleton
    private static Singleton single_instance = null;

    // Declaring a variable of type String
    public String unique;

    // Constructor
    // Here we will be creating private constructor
    // restricted to this class itself
    private Singleton() {
        unique = "Hello I am a string part of Singleton class hash="+this.hashCode()+"-"+Math.random();
    }

    // Static method
    // Static method to create instance of Singleton class
    public static synchronized Singleton getInstance() {
        if (single_instance == null)
            single_instance = new Singleton();

        return single_instance;
    }

    @Override
    public String toString() {
        return "Singleton ["+this.unique+ "]";
    }
}

public class Q4 {
    public static void q4() {
        // Implement a test where you create three Singleton
        // objects and you prove they are the same
    }
}