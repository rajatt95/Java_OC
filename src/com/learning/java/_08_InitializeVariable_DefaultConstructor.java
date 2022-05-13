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

public class _08_InitializeVariable_DefaultConstructor {

    // Variable/Field/Parameter
    int number1;

    // Constructor
    public _08_InitializeVariable_DefaultConstructor(){
        number1 = 100;
    }

    // Pre-Defined method
    public static void main(String[] args) {

        System.out.println("Hi, Test Automation Engineer");

        _08_InitializeVariable_DefaultConstructor obj1 = new _08_InitializeVariable_DefaultConstructor();
        System.out.println("obj1.number1 = " + obj1.number1);
    }// main

}// class





