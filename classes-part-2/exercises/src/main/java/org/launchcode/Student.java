package org.launchcode;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits = 0;
    private double gpa = 0.0;

    public Student (String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() {
        return (this.name + " has a GPA of: " + this.gpa);
    }


    //TODO: Uncomment and complete the getGradeLevel method here:
    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits
        if (this.numberOfCredits <=0)
        {
            return "You received a zero.";
        }
         else if (this.numberOfCredits <= 29 )
        {
            return "Freshman";
        }
         else if (this.numberOfCredits > 29 && this.numberOfCredits <= 59)
        {
            return "Sophomore";
        }
         else if (this.numberOfCredits > 59 && this.numberOfCredits <= 89)
        {
            return "Junior";
        }
         else if (this.numberOfCredits > 89)
        {
            return "Senior";
        }
         else {
             return "We dont know what to categorize you as.";
        }
    }

    // TODO: Complete the addGrade method.
    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa
//        gpa = (total quality score) / (total number of credits)
//        The quality score for a class is found by multiplying the letter grade score (0.0-4.0) by the number of credits.
//
//The total quality score is the sum of the quality scores for all classes.
        double totalQualityScore = this.gpa * this.numberOfCredits;
        totalQualityScore += courseCredits * grade;
        this.numberOfCredits += courseCredits;
        this.gpa = totalQualityScore/this.numberOfCredits;
//        System.out.println("Course credits: " + courseCredits + " Grade: " + grade);
//        double qualityScore = grade * courseCredits;
//        System.out.println(qualityScore + " " + gpa + " " + numberOfCredits);
//        double totalQualityScore = this.gpa * this.numberOfCredits;
//        System.out.println(totalQualityScore);
//        totalQualityScore += qualityScore;
//        System.out.println(totalQualityScore);
//        this.numberOfCredits += courseCredits;
//        this.gpa = totalQualityScore/this.numberOfCredits;
//        System.out.println(qualityScore + " " + gpa + " " + numberOfCredits);
//        System.out.println(qualityScore + " " + gpa + " " + numberOfCredits);

//
    }

    // TODO: Add your custom 'toString' method here. Make sure it returns a well-formatted String rather
    //  than just the class fields.
    public String toString(){
        return "Student " + this.name + "\n" +
                "Student ID " + this.studentId + "\n" +
                "Number of Credits " + this.numberOfCredits + "\n" +
                "Student GPA " + this.gpa + "\n";

    }

    // TODO: Add your custom 'equals' method here. Consider which fields should match in order to call two
    //  Student objects equal.
    public boolean equals(Student student)
    {
        if (student == null)
        {
            return false;
        }
        else if (student.getClass() != this.getClass()){
            return false;
        }
        else if (student.studentId != this.studentId)
        {
            return false;
        }
        else if(student.name != this.name){
            return false;
        }
        else {
            return  true;
        }
    }

    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    private void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public static void main(String[] args) {
        Student sally = new Student("Sally",1,1,4.0);
        System.out.println("The Student class works! " + sally.getName() + " is a student!");
        System.out.println(sally);
        sally.addGrade(12, 3.5);
        System.out.println(sally);
        sally.addGrade(25, 3.8);
        System.out.println(sally);
    }
}