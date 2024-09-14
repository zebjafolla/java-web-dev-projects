import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Course {
    private String courseName;
    private String subject;
    private String teacherName;
    private HashMap <Integer, Student> studentList = new HashMap <Integer, Student> (){};
    public Course(String courseName, String subject, String teacherName)
    {
        this.courseName = courseName;
        this.subject = subject;
        this.teacherName = teacherName;
    }

    public String getCourseName() {
        return "Course Name: " + this.courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getSubject() {
        return "Subject Name: " + this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getTeacherName() {
        return "Teacher Name: " + this.teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }
    public String getClassInfo(){
        return getCourseName() + "\n" + getSubject() + "\n" + getTeacherName() + "\n" + getStudentList();
    }
    public void addStudent(Integer studentNumber, Student student)
    {
        this.studentList.put(studentNumber, student);
    }
    public String getStudentList(){
        String aStudentList = "\nStudent List: ";

        for (Map.Entry <Integer, Student> entry : this.studentList.entrySet())
        {
            aStudentList += "\nStudent: " + entry.getKey() + ", Name: " + entry.getValue().getName();
        }
        return aStudentList;
    }
}
