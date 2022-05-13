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

public class _30_OOPS_Inheritance_App {

    public static void main(String[] args) {
        _29_OOPS_Inheritance_SubClass obj = new _29_OOPS_Inheritance_SubClass(); // Super class Constructor
                                                                                 // Sub class Constructor

        // Super class properties
        System.out.println("obj.superStr = " + obj.superStr); // obj.superStr = Super class Field
        obj.superClassMethod(); // Super class Method

        // Sub class properties
        obj.subClassMethod(); // Sub class Method

        obj.printCommonString();
    }
}// class





