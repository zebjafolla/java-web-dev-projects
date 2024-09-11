import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapDuplicate {
    public static void main(String[] args) {
        HashMap<String, Integer> studentRoster = new HashMap<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Please input a student name: ");
        System.out.println("Please input a student name: ");
        String studentName = input.nextLine();
        System.out.println("Please input a student id: ");
        int studentId = input.nextInt();
        studentRoster.put(studentName, studentId);
        studentRoster.put("Kayla", 19);
        studentRoster.put("Johnny", 23);
        System.out.println(studentRoster.size());
        for (Map.Entry<String, Integer> student : studentRoster.entrySet()) {
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
        }
        input.close();
    }
}
//comment
