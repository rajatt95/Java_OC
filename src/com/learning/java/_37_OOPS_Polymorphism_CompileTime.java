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

public class _37_OOPS_Polymorphism_CompileTime {

    // Method Overloading
    public void display(String name){
        System.out.println("-----------------");
        System.out.println("name = " + name);
    }

    public void display(String name, int age){
        System.out.println("-----------------");
        System.out.println("name = " + name);
        System.out.println("age = " + age);
    }

    public void display(String name, int age, String country){
        System.out.println("-----------------");
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("country = " + country);
    }

}// class





