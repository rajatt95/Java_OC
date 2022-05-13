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

public class _15_String_Operations {

    static String str = "Hello, Test Automation Engineer!";

    public static void main(String[] args) {
        System.out.println("str = " + str); // str = Hello, Test Automation Engineer!
        System.out.println("str.toLowerCase() = " + str.toLowerCase()); // hello, test automation engineer!
        System.out.println("str.toUpperCase() = " + str.toUpperCase()); // HELLO, TEST AUTOMATION ENGINEER!
        System.out.println("str.charAt(1) = " + str.charAt(1)); // e
        System.out.println("str.substring(5) = " + str.substring(5)); // , Test Automation Engineer!
        System.out.println("str.substring(5,11) = " + str.substring(5, 11)); // , Test
        System.out.println("str.contains(\"Test\") = " + str.contains("Test")); // true
        System.out.println("str.length() = " + str.length()); // 32
        System.out.println("str.indexOf('T') = " + str.indexOf('T')); // 7
        System.out.println("str.concat(\" -> Rajat\") = " + str.concat(" -> Rajat")); // Hello, Test Automation Engineer! -> Rajat
        System.out.println("str.equals(\"Test\") = " + str.equals("Test")); // false
        System.out.println("str.equalsIgnoreCase(\"Hi\") = " + str.equalsIgnoreCase("Hi")); // false

    }// main
}// class





