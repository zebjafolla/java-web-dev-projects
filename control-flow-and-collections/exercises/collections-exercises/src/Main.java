
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        String str = "I would not, could not, in a box. I would not, could not " +
                "with a fox. I will not eat them in a house. I will not eat them " +
                "with a mouse.";
        int[] arr = {1, 1, 2, 3, 5, 8};
        for(int n: arr)
        {
            System.out.println("Everything: " + n);
        }
        for (int n: arr)
        {
            if (n % 2 != 0)
            {
                System.out.println("Odds: " + n);
            }
        }
        String[] str1 = str.split("\\.");
        for (String sentence: str1)
        {
            System.out.println(sentence);
        }

        /*Write a static method to find the sum of
        all the even numbers in an ArrayList. Within main,
        create a list with at least 10 integers and call your method on the list.*/
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        int sum = 0;
        for (Integer number: numbers)
        {
            if (number % 2 != 0)
            {
                sum += number;
                System.out.println(number);
            }
        }
        System.out.println("The sum of all the odd numbers is " + sum);

 /*Check your solution
Write a static method to print out each word in a list that has exactly 5 letters.*/
ArrayList <String> words = new ArrayList <String>();
words.add("Hello");
        words.add("Bucadibeppo");
        words.add("Highlighter");
        words.add("Friendly");
        words.add("Fighting");
        words.add("Water");
        words.add("Soap");
        for(String word: words)
        {
            if((word.length()) == 5)
            {
                System.out.println(word);
            }
        }
/*Modify your code to prompt the user to enter the word length for the search.*/
Scanner input = new Scanner(System.in);
        System.out.println("Please enter the word 'length':");
String userInput = input.next();
    words.add(userInput);




 /*Check your solution
BONUS: Instead of creating our own list of words,
what if we want to use the string from the Array Practice section?
Search “Java convert String to ArrayList” online to see how to
split a string into the more flexible ArrayList collection.*/
        List <String> str2 = new ArrayList<>();
        System.out.println(str2);

        /*Make a program similar to GradebookHashMap that does the following:

        It takes in student names and ID numbers (as integers) instead of names and grades.
            The keys should be the IDs and the values should be the names.
        Modify the roster printing code accordingly.*/





    }
}