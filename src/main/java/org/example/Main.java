package org.example;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {

int nums[]={1,2,3,};


        System.out.println("Exceptions....");

        System.out.println("Array is size "+nums.length);

        System.out.println("Position 1 has the value "+nums[1]);

        try {
            System.out.println("Position 4 has the value "+nums[4]);
        } catch (Exception e) {
            throw new RuntimeException(e);

        }


        ///////////////////////////////next one //////////////////////////////

        FileReader fileReader = new FileReader("myFile.txt");


    }
}