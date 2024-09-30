package org.launchcode;

public class StringUtilsClass {
    public static void throwsExcept(String input){
        if (input == null)
        {
            throw new IllegalArgumentException("Cannot be null");
        }
    }

    public static boolean checkAlpha(String input){
        if(input == null)
        {
            throw new IllegalArgumentException("Input cannot be null");
        }
        if(!input.matches("[A-Za-z]+"));
        {
            throw new IllegalArgumentException("Input must only contain alphanumeric characters");
        }

    }
}
