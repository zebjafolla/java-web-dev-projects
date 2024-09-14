public class StudentPractice {
    public static void main(String[] args){
        //insantiate your Student class below
        Student zeb = new Student("Zeb", 1, 666, 4.0);
        Course math = new Course("Math", "Arithmetic", "Lorna Michaels");
       math.addStudent(1, zeb);
       Student pat = new Student("Pat", 2, 669, 4.0);
       math.addStudent(2, pat);
       Teacher abby = new Teacher("Abby", "Abigail", "Math", 4);
       math.setTeacherName(abby.getFirstName() + " " + abby.getLastName());
       Course science = new Course("Science", "Science", "Mark Leonard");
       Teacher mark = new Teacher("Mark", "Leonard", "Science", 10);
       science.setTeacherName(mark.getFirstName() + " " + mark.getLastName());
       science.addStudent(1, zeb);
       science.addStudent(2, pat);
        System.out.println(science.getClassInfo());


//        System.out.println(math.getStudentList());
    }
}
