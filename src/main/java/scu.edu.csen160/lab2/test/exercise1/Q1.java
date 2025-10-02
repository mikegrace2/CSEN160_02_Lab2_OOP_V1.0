package scu.edu.csen160.lab2.test.exercise1;

//public class Q1 {
//}
//package edu.scu.coen160.lab2;
//
///**
// * @(#)Stack.java
// */
class Array {
    private int[] itemList = null;
    private int maxLength = -1;
    private int index = -1;

    private Array() {
        // Not allowed!
    }

    public Array(int maxLength) {
        this.maxLength = maxLength;
        this.itemList = new int[this.maxLength];
        this.index=0;
    }

    public void add(int element) {
        if (this.index < this.maxLength && this.index >= 0) {
            this.itemList[this.index++] = element;
        }
    }

    public int remove() {
        if (this.index < this.maxLength && this.index >= 0) {
            this.index=this.index-1;
            return this.itemList[this.index];
        }else {
            return -1;
        }
    }

    public int[] returnArray() {
        int[] retArr=new int[this.index];
        for (int i = 0; i < this.index; ++i)
            retArr[i]=this.itemList[i];

        return retArr;
    }
}

class Stack {
    private Array myArr=null;

    private Stack() {
        // Not allowed!
    }

    public Stack(int maxLength) {
        // ToDo: Implement me
        // Create Array with maximum length
//        this.maxLength = maxLength;
        this.myArr = new Array(maxLength);
//        this.index=0;
    }

    public void push(int value) {
        // ToDo: Implement me
        // push one object to the array
        this.myArr.add(value);
    }

    public int pop() {
        // ToDo: Implement me
        // Remove one object
        return this.myArr.remove();
    }

    public void showStack() {
        // ToDo: Show the elements in the order of LIFO
        // List array backwards
        int[] new_arr = this.myArr.returnArray();
        for (int i = new_arr.length - 1; i >= 0; i--) {
            System.out.println(new_arr[i]);
        }
    }
}

public class Q1 {
    public static void q1() {
        Stack myStack = new Stack(30);

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);

        int pop1=myStack.pop();
        if (pop1 != 40) {
            System.out.println("ERROR_01: 40 expected, but "+pop1+" received!");
            return;
        }

        myStack.push(4711);
        int pop2=myStack.pop();
        if (pop2 != 4711) {
            System.out.println("ERROR_02: 4711 expected, but "+pop2+" received!");
            return;
        }

        int pop3=myStack.pop();
        if (pop3 != 30) {
            System.out.println("ERROR_03: 30 expected, but "+pop3+" received!");
            return;
        }

        myStack.showStack();
    }
}