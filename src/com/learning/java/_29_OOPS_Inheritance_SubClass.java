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

public class _29_OOPS_Inheritance_SubClass extends _28_OOPS_Inheritance_SuperClass{

    // Fields
    String commonStr = "Sub common String";

    // Constructor
    public _29_OOPS_Inheritance_SubClass(){
        System.out.println("Sub class Constructor");
    }

    // Method
    public void subClassMethod(){
        System.out.println("Sub class Method");
    }

    public void printCommonString(){
        System.out.println("--------------------");
        System.out.println("commonStr = " + commonStr); // Sub common String
        System.out.println("super.commonStr = " + super.commonStr); // Super common String
    }
}// class





