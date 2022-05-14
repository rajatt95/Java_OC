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

public class _36_OOPS_Polymorphism_Runtime_App{

    public static void main(String[] args) {

        // _33_OOPS_Polymorphism_Runtime_Employee -> Reference
        // _34_OOPS_Polymorphism_Runtime_FullTime -> Type of the Object
        // At Runtime, method will be called/executed on the basis of type of Object
        _33_OOPS_Polymorphism_Runtime_Employee employee_FT = new _34_OOPS_Polymorphism_Runtime_FullTime();
        employee_FT.salary(); // Employee (Full Time) Salary: 40000

        _33_OOPS_Polymorphism_Runtime_Employee employee_C = new _35_OOPS_Polymorphism_Runtime_Contract();
        employee_C.salary(); // Employee (Contract) Salary: 30000

        // Method specific to child class
        _34_OOPS_Polymorphism_Runtime_FullTime employeeFullTime = new _34_OOPS_Polymorphism_Runtime_FullTime();
        employeeFullTime.methodFullTime(); // Method in Full Time class


        /********** STATIC METHODS *************/
        // We can not override static and final methods
        _33_OOPS_Polymorphism_Runtime_Employee.designation(); // Tester
        _34_OOPS_Polymorphism_Runtime_FullTime.designation(); // Tester: Full Time
        _35_OOPS_Polymorphism_Runtime_Contract.designation(); // Tester: Contract
    }// main
}// class





