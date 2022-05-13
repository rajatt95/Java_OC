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

public class _19_CS_IfElse_Condition_AND {

    public static void main(String[] args) {

        // & -> Both the conditions has to be true
        if(true & true){
            System.out.println("true & true");
            System.out.println("Inside if block"); // Inside if block
        }else{
            System.out.println("Inside else block");
        }

        if(true & false){
            System.out.println("Inside if block");
        }else{
            System.out.println("true & false");
            System.out.println("Inside else block"); // Inside else block
        }

    }// main
}// class





