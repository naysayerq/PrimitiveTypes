/*
 * Classname Main
 * Version 1.0
 *
 * Copyright Skryp Andriy
 */

package com.company;

public class Main {

    public static void main(String[] args) {

        byte daysToLearn = 32;
        short calories = 2500;
        int totalSeconds = 678000000;
        long distance = 149600000000L;
        float weight = 66.5F;
        double points = 27.6D;
        char number = '5';
        boolean isMale = true;

        String aboutMyself = "I have " + daysToLearn + " days to learn Java." +
                "\nI consume " + calories + " calories daily.\n" +
                totalSeconds + " seconds have passed since my birth.\nFrom " +
                "me to the sun " + distance + " meters.\nMy weight is "
                + weight + " kg.\nI need " + points + " points to " +
                "access the test.\nMy favorite " + "number is " + number +
                ".\nI am male, it's    " + isMale;

        System.out.println(aboutMyself);
        System.out.println(aboutMyself.length());

    }
}
