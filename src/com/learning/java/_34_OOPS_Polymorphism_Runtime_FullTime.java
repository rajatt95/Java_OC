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

// OOPS - Inheritance
    // _34_OOPS_Polymorphism_Runtime_FullTime - Sub/Derived/Child Class
    // _33_OOPS_Polymorphism_Runtime_Employee - Super/Base/Parent Class
public class _34_OOPS_Polymorphism_Runtime_FullTime extends  _33_OOPS_Polymorphism_Runtime_Employee{

    // OOPS Polymorphism
        // Runtime
            // Method Overriding
    @Override
    void salary(){
        System.out.println("Employee (Full Time) Salary: " + (base+20000));
    }

    void methodFullTime(){
        System.out.println("Method in Full Time class");
    }

    // We can not override static and final methods
    //@Override
    static void designation(){
        System.out.println("Tester: Full Time");
    }

}// class





