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

public class _07_InitializeVariable_Method {

    // Variable/Field/Parameter
    int number1;

    // Pre-Defined method
    public static void main(String[] args) {

        System.out.println("Hi, Test Automation Engineer");

        _07_InitializeVariable_Method obj1 = new _07_InitializeVariable_Method();
        obj1.initialize();
        System.out.println("obj1.number1 = " + obj1.number1);

    }// main

    public void initialize(){
        number1 = 100;
    }// initialize
}// class





