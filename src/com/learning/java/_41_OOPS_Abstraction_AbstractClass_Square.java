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


public class _41_OOPS_Abstraction_AbstractClass_Square extends  _39_OOPS_Abstraction_AbstractClass_Shape{

    double side;

    public _41_OOPS_Abstraction_AbstractClass_Square(String color, double side) {
        super(color);
        this.side = side;
    }

    // area() and colorInfo() -> Abstract methods coming from _39_OOPS_Abstraction_AbstractClass_Shape
    @Override
    double area() {
         return Math.pow(side, 2);
    }

    @Override
    String info() {
        return "I'm a "+super.color+" Square with Area: "+area();
    }
}// class





