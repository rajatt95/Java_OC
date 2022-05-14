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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class _51_EH_TryCatchFinally_Block_Keyword_throw {

    public static void main(String[] args) throws FileNotFoundException {

        try {
            File file = new File("./SomePath");

            // java.io.FileNotFoundException -> Compile Time Exception
            FileReader fileReader = new FileReader(file);
        }catch (FileNotFoundException fileNotFoundException){
            fileNotFoundException.printStackTrace();
            throw fileNotFoundException;
        }finally {
            System.out.println("Inside finally block");
        } // finally block will execute (Does not matter, Exception comes or not)

        // This below code will not execute
            // because we are throwing the Exception explicitly on line # 29
                // and, added this exception in Method Signature
        System.out.println("Exception handled using try-catch block.");
    }//main
}// class





