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

public class _23_CS_Loop_FOR_EACH_Break {

    public static void main(String[] args) {

        String[] strArray ={"Shreya","Shweta","Shruti","Preeti","Tanya"};

        for (String str: strArray) {
            System.out.println(str);
            if(str.equalsIgnoreCase("Shruti")){
                break; // Come out of the FOR EACH loop when value of variable 'str' is Shruti
            }
        }

    }// main
}// class





