// Program to demonstrate ways of creating new object in Java

package com.objects;

// Test class
class Test implements Cloneable {

    // Method clone() to create copy of an object
    @Override
    public Object clone(){
        Object clone1 = null;
        try {
            clone1 = super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println(e.getStackTrace());
        }
        return clone1;
    }

    @Override
    public String toString() {
        return "new Test object";
    }
}

// Main class
public class Main {

    // Main method to run Java program
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException,
            IllegalAccessException {

        // Creating new object with using new keyword
        Test test = new Test();

        // Check that object was created
        System.out.println(test);

        // Creating new object using Class.forName(String className) method
        Test test1 = (Test)Class.forName("com.objects.Test").newInstance();

        // Check that object was created
        System.out.println(test1);

        // Using method clone() creates a copy of an object
        Test test2 = (Test) test.clone();

        // Check that object was created
        System.out.println(test2);
    }
}