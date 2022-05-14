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
import java.io.IOException;

public class _54_EH_CustomException_Impl extends Exception{

    public static void main(String[] args) {

        File file = new File("./SomePath");

        // java.io.FileNotFoundException -> Compile Time Exception
        try (
        FileReader fileReader = new FileReader(file)) {
            throw new _53_EH_CustomException();
        } catch (_53_EH_CustomException exception) {
            exception.customException();
            // exception.printStackTrace();
        } catch (IOException e) {
            // e.printStackTrace();
        }

        System.out.println("Exception handled with Custom (User-Defined) Exception");

    }// main
}// class





