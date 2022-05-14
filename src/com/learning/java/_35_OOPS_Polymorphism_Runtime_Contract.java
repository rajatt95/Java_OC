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
    // _35_OOPS_Polymorphism_Runtime_Contractor - Sub/Derived/Child Class
    // _33_OOPS_Polymorphism_Runtime_Employee - Super/Base/Parent Class
public class _35_OOPS_Polymorphism_Runtime_Contract extends  _33_OOPS_Polymorphism_Runtime_Employee{

    // OOPS Polymorphism
        // Runtime
            // Method Overriding
    @Override
    void salary(){
        System.out.println("Employee (Contract) Salary: " + (base+10000));
    }

    void methodContract(){
        System.out.println("Method in Contract class");
    }

    // We can not override static and final methods
    //@Override
    static void designation(){
        System.out.println("Tester: Contract");
    }

}// class





