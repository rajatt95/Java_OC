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

public class _05_Constructor {

    // Constructor
    public _05_Constructor(){
        System.out.println("Default Constructor"); // Gets called when object is created
    }// Constructor

    // Class variable
    int number1 = 10;

    // Pre-Defined method
    public static void main(String[] args) {
        System.out.println("Hi, Test Automation Engineer");

        // Creating object of class
        // ClassName objectName = new ClassName();
        _05_Constructor obj1 = new _05_Constructor();

        System.out.println("obj1.number1 = " + obj1.number1);
    }// main
}// class





