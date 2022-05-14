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

public class _47_OOPS_Abstraction_Interface_App {

    public static void main(String[] args) {
        _45_OOPS_Abstraction_Interface_Class_Circle circle =
                new _45_OOPS_Abstraction_Interface_Class_Circle("Red", 2);

        System.out.println("circle.info() = " + circle.info()); // I'm a Red Circle with Area: 12.566370614359172

        _46_OOPS_Abstraction_Interface_Class_Square square =
                new _46_OOPS_Abstraction_Interface_Class_Square("Yellow", 4);

        System.out.println("square.info() = " + square.info()); // I'm a Yellow Square with Area: 16.0

        // Interface ->
            // Access Variable
            // Static method
        System.out.println("_44_OOPS_Abstraction_Interface_Shape.number = " +
                _44_OOPS_Abstraction_Interface_Shape.number); // 100

        _44_OOPS_Abstraction_Interface_Shape.staticMethod(); // Static method

    }//main
}// class





