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
import java.io.FileReader;
import java.io.IOException;

public class _55_FileOperations extends Exception{

    public static void main(String[] args) {

        File file = new File("./src/resources/DataFile.txt");

        System.out.println("file.exists() = " + file.exists()); // true
        System.out.println("file.canRead() = " + file.canRead()); // true
        System.out.println("file.canExecute() = " + file.canExecute()); // false
        System.out.println("file.canWrite() = " + file.canWrite()); // true

    }// main
}// class





