/**
 * @author Rajat Verma
 * https://www.linkedin.com/in/rajat-v-3b0685128/
 * https://github.com/rajatt95
 * https://rajatt95.github.io/
 *
 * Course: Selenium Java Test Framework & Best Practices - Masterclass (https://www.udemy.com/course/selenium-java-test-framework/)
 * Tutor: Omprakash Chavan (https://www.udemy.com/user/omprakash-chavan/)
 */
/***************************************************/

package com.learning.java;


public interface  _44_OOPS_Abstraction_Interface_Shape {

    // In Interface,
        // Default ->
            // Variables are public, static and final
            // Methods are Abstract and public

    // Variable
    int number = 100;

    // Method
    String color();
    double area();
    String info();

    // From Java 8,
        // Interface can have a default method, static method
    default void defaultMethod(){
        System.out.println("Default method");
    }
    static void staticMethod(){
        System.out.println("Static method");
    }

}// interface





