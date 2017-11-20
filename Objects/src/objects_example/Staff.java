package objects_example;

public class Staff extends Person{
    private String jobTitle;
    private String department;

    public Staff() {
        super();
        jobTitle = "not yet specified";
        department = "not yet specified";
    }

    public Staff(String name, int age, String jobTitle, String department) {
        super(name, age);
        this.jobTitle = jobTitle;
        this.department = department;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setDepartment(String department) {
        this.department= department;
    }

    public String getDepartment() {
        return department;
    }

    public double pay() { // No return... is this an error?
        throw new RuntimeException("Not yet implemented!");
    }

    @Override
    public String toString() {
        return "Staff Information:\n" +
               "Name: " + this.getName() +
               ", Age: " + this.getAge() +
               ", Job Title: " + jobTitle +
               ", Department: " + department + "\n";
    }
}
