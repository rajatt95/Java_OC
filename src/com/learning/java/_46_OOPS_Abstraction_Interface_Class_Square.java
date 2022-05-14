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


public class _46_OOPS_Abstraction_Interface_Class_Square implements _44_OOPS_Abstraction_Interface_Shape{

    String color;
    double side;

    public _46_OOPS_Abstraction_Interface_Class_Square(String color, double side){
        this.color = color;
        this.side = side;
    }

    @Override
    public String color() {
        return color;
    }

    @Override
    public double area() {
        return Math.pow(side,2);
    }

    @Override
    public String info() {
        return "I'm a "+color()+" Square with Area: "+area();
    }
}// class





