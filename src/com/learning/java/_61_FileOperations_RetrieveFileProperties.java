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

public class _61_FileOperations_RetrieveFileProperties {

    public static void main(String[] args) {

        File file = new File("./src/resources/DataFile.txt");

        // Retrieve File Properties

        System.out.println("file.getName() = " + file.getName()); // DataFile.txt
        System.out.println("file.getPath() = " + file.getPath()); //./src/resources/DataFile.txt
        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath()); //  /Users/rajatverma/Desktop/Work/Local_intelliJ_WS/UDEMY_OC_Selenium Java Test Framework & Best Practices - Masterclass/01_OC_Java_Essentials/./src/resources/DataFile.txt

        // To Delete the file
        // file.delete();

    }// main
}// class





