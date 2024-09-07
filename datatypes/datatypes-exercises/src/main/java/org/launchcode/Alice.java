package org.launchcode;
import java.util.Scanner;

public class Alice {
    public static void main(String[] args){
        String sentence = "Alice was beginning to get very tired of sitting by her " +
                "sister on the bank, and of having nothing to do: once or twice she " +
                "had peeped into the book her sister was reading, but it had no " +
                "pictures or conversations in it, ‘and what is the use of a book,’ " +
                "thought Alice ‘without pictures or conversation?’";
        sentence = sentence.toLowerCase();
        System.out.println("Please enter a search term to look for in the stored " +
                "sentence: ");
        Scanner input = new Scanner(System.in);
        String searchTerm = input.next();
        searchTerm = searchTerm.toLowerCase();
        int index = sentence.indexOf(searchTerm);
        boolean result;
        if (index == -1)
        {
            result = false;
        }
        else {
           result = true;
        }
        System.out.println("The stored string does contain the searched term " +
                searchTerm + ": " + result + " .");
        System.out.println("Index is " + index);
        System.out.println("The string character length is " + searchTerm.length());
        String newSentence = sentence.substring(index + searchTerm.length(), sentence.length() - 1);
        System.out.println(newSentence);
/*
        Extend the previous exercise. Assume the user enters a word that
        is in the sentence. Print out its index within the string and
        its length. Next, remove the word from the string and print the
        sentence again to confirm your code. Remember that strings are immutable,
        so you will need to reassign the old sentence variable or create a new
        one to store the updated phrase.
*/



    }
}
