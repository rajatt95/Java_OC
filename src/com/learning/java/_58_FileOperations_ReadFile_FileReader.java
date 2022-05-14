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

public class _58_FileOperations_ReadFile_FileReader {

    public static void main(String[] args) {

        File file = new File("./src/resources/DataFile.txt");

        // Read content from file using FileReader
        try {
            FileReader fileReader = new FileReader(file);
            int i;
            while ((i = fileReader.read())!= -1){
                System.out.print((char)i);
            }
            fileReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }// main
}// class





