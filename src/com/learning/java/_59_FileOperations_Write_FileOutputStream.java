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

import java.io.*;
import java.nio.charset.StandardCharsets;

public class _59_FileOperations_Write_FileOutputStream {

    public static void main(String[] args) {

        File file = new File("./src/resources/DataFile_3.txt");

        // If file - DataFile_2.txt is not present, Then, create new file
        if(!file.exists()){
            try {
                file.createNewFile();
                
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        // Write content into file using FileOutputStream
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            String content = "DATA-3.txt -> Hi, Test Automation Engineer!";
            fileOutputStream.write(content.getBytes());
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }// main
}// class





