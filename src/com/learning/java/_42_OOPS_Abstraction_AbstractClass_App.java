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


public class _42_OOPS_Abstraction_AbstractClass_App {

    public static void main(String[] args) {
        _40_OOPS_Abstraction_AbstractClass_Circle circle =
                new _40_OOPS_Abstraction_AbstractClass_Circle("Red", 2);

        System.out.println("circle.info() = " + circle.info()); // I'm a Red Circle with Area: 12.566370614359172

        _41_OOPS_Abstraction_AbstractClass_Square square =
                new _41_OOPS_Abstraction_AbstractClass_Square("Yellow", 4);

        System.out.println("square.info() = " + square.info()); // I'm a Yellow Square with Area: 16.0

    }
}// class





