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

public class _27_CS_SwitchCase_WithEnum {

    enum custom_Char{
        a,b;
    }
    public static void main(String[] args) {
      custom_Char required_Char =  custom_Char.a;

      switch (required_Char){
          case a:
              System.out.println("Value is a"); // Value is a
              break;
          case b:
              System.out.println("Value is b");
              break;
          default:
              System.out.println("Option not-in-scope");
      }
    }// main
}// class





