package scu.edu.csen160.lab2.test.exercise3;

//public class Q3 {
//}

//package edu.scu.coen160.lab2;
//

/**
 * Lockable Items
 */
interface Lockable {
    // ToDo: Implement Lockable interface
    public void lock(String key);
    public void unlock(String key);
}

class Box implements Lockable {
    private String password = null;
    boolean locked = false;

    private Box() {
        // Not allowed!
    }

    public Box(String password) {
        // ToDo: Implement
        this.password = password;
    }

    public void lock(String password) {
        // If password is equal to the saved password
        // set locked to true
        // ToDo: Implement
        if (this.password.equals(password)) {
            locked = true;
        }
    }

    public void unlock(String password) {
        // Write code to check if locked is true or false.
        // if false do nothing.
        // If true, compare password and password.
        // If they are equal, set locked to false.

        // ToDo: Implement
        if (locked) {
            if (password.equals(this.password)) {
                locked = false;
            }
        }
    }

    public void show() {
        if (!this.locked) {
            System.out.println("Box: Showing Contents ... :)");
        } else
            System.out.println("Box: LOCKED!");
    }
}

class Computer implements Lockable {
    private String password = null;
    private boolean locked = false;

    private Computer() {
        // Not allowed!
    }

    public Computer(String password) {
        // ToDo: Implement
        this.password = password;
    }

    public void lock(String password) {
        // If password is equal to the saved password
        // set locked to true

        // ToDo: Implement
        if (this.password.equals(password)) {
            locked = true;
        }
    }

    public void unlock(String pword) {
        // Write code to check if locked is true or false.
        // if false do nothing.
        // If true, compare password and password.
        // If they are equal, set locked to false.

        // ToDo: Implement
        if (locked) {
            if (this.password.equals(pword)) {
                locked = false;
            }
        }
    }

    public void show() {
        if (!locked) {
            System.out.println("Computer: ready to work ... :)");
        } else
            System.out.println("Computer: LOCKED!");
    }
}

public class Q3 {
    public static void q3() {
        Box box1 = new Box("1234");

        box1.lock("1234");
        box1.unlock("1234");
        box1.show();

        Computer c1 = new Computer("6862");
        c1.lock("6862");
        c1.show();

        c1.unlock("6862");
        c1.show();
    }
}