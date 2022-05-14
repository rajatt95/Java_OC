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
import java.io.FileWriter;
import java.io.IOException;

public class _57_FileOperations_Write_FileWriter {

    public static void main(String[] args) {

        File file = new File("./src/resources/DataFile_2.txt");

        // If file - DataFile_2.txt is not present, Then, create new file
        if(!file.exists()){
            try {
                file.createNewFile();
                
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Write content into file using FileWriter
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("DATA-2.txt -> Hi, Test Automation Engineer!");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }// main
}// class





