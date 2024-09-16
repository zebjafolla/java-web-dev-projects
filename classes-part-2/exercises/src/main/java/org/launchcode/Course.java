package org.launchcode;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Course {
    private String topic;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather than
    //  just the class fields.
    public String toString(Course course){
        return "Teacher name: " + course.instructor + "\n" +
                "Topic : " + course.topic + "\n" +
                "Enrolled Students: " + course.enrolledStudents + "\n";
    }


    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Course objects equal.
    public boolean equals(Course course){
        if(course.instructor == this.instructor && course.topic == this.topic)
        {
            return true;
        }
        else{
            return false;
        }
    }

}
