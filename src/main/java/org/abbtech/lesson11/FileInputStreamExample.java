package org.abbtech.lesson11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

    public class FileInputStreamExample {
        public static void main(String[] args) {
            FileInputStream inputStream = null;
            try {

                File file = new File("example.txt");

                inputStream = new FileInputStream(file);


                int character;
                while ((character = inputStream.read()) != -1) {
                    System.out.print((char) character);
                }
            } catch (FileNotFoundException e) {
                System.out.println(" " + e.getMessage());
            } catch (IOException e) {
                System.out.println(" " + e.getMessage());
            } finally{
                try {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException e) {
                    System.out.println("InputStream: " + e.getMessage());
                }
            }}}




