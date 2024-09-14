public class Teacher {
    private String firstName;
    private String lastName;
    private String subject;
    private int yearsTeaching;

    public Teacher(String firstName, String lastName, String subject, int yearsTeaching){
        this.firstName = firstName;
        this.lastName = lastName;
        this.subject = subject;
        this.yearsTeaching = yearsTeaching;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public void setYearsTeaching(int yearsTeaching){
        this.yearsTeaching = yearsTeaching;
    }

    public String getSubject(){
        return this.subject;
    }
    public int getYearsTeaching(){
        return this.yearsTeaching;
    }
}
