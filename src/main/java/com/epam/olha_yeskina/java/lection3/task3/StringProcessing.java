package com.epam.olha_yeskina.java.lection3.task3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Ввести n строк с консоли, найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.
 */
public class StringProcessing {

    static final int STRINGS_COUNT = 5;

    public static void main(String[] args) throws IOException {

        ArrayList<String> strings= new ArrayList<String>();
        inputStrings(strings);
        outputMinLengthString(strings);
        outputMaxLengthString(strings);

    }

    public static void inputStrings(ArrayList<String> strings) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        strings.add(br.readLine());
        for (int i = 1; i < STRINGS_COUNT ; i++) {
            strings.add(br.readLine());
        }
    }

    public static void outputMinLengthString(ArrayList<String> strings){
        int minLength = strings.get(0).length();
       // String minLengthSting = strings.get(0);
        for (int i = 1; i < STRINGS_COUNT ; i++) {
            if(strings.get(i).length() < minLength){
                minLength = strings.get(i).length();
            }
        }
        for (int i = 1; i < STRINGS_COUNT ; i++) {
            if(strings.get(i).length() == minLength){
                System.out.println("Shortest string: " + strings.get(i));
                System.out.println("Shortest string length = " + strings.get(i).length());
            }
        }
    }
    public static void outputMaxLengthString(ArrayList<String> strings){
        int maxLength = strings.get(0).length();
      //  String minLengthSting = strings.get(0);
        for (int i = 1; i < STRINGS_COUNT ; i++) {
            if(strings.get(i).length() > maxLength){
                maxLength = strings.get(i).length();
            }
        }
        for (int i = 1; i < STRINGS_COUNT ; i++) {
            if(strings.get(i).length() == maxLength){
                System.out.println("Longest string: " + strings.get(i));
                System.out.println("Longest string length = " + strings.get(i).length());
            }
        }
    }
}
