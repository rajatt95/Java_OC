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


public class _40_OOPS_Abstraction_AbstractClass_Circle extends  _39_OOPS_Abstraction_AbstractClass_Shape{

    double radius;

    public _40_OOPS_Abstraction_AbstractClass_Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    // area() and colorInfo() -> Abstract methods coming from _39_OOPS_Abstraction_AbstractClass_Shape
    @Override
    double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    String info() {
        return "I'm a "+super.color+" Circle with Area: "+area();
    }
}// class





