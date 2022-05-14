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

public class _45_OOPS_Abstraction_Interface_Class_Circle implements  _44_OOPS_Abstraction_Interface_Shape{

    String color;
    double radius;

    public _45_OOPS_Abstraction_Interface_Class_Circle(String color, double radius){
        this.color = color;
        this.radius = radius;
    }

    @Override
    public String color() {
        return color;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public String info() {
        return "I'm a "+color()+" Circle with Area: "+area();
    }
}// class





