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
import java.io.IOException;

public class _62_FileOperations_MakeDirectories {

    public static void main(String[] args) {

        String directoryPath = "./src/resources/directories" +File.separator +
                "directory_1" + File.separator + "directory_2";

        File directory = new File(directoryPath);

        // Create Directories
        if(!directory.exists()){
            directory.mkdirs();
        }

    }// main
}// class





