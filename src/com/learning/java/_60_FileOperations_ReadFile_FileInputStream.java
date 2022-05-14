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

public class _60_FileOperations_ReadFile_FileInputStream {

    public static void main(String[] args) {

        File file = new File("./src/resources/DataFile.txt");

        // Read content from file using FileInputStream

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            int i;
            while ((i = fileInputStream.read())!= -1){
                System.out.print((char)i);
            }
            fileInputStream.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }// main
}// class





