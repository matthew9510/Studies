package objects_example;

public class Student extends Person {
    private int year;
    private int idNumber;
    private String major;

    public Student() {
        super();
        year = 1;
        idNumber = 0;
        major = "not yet specified";
    }

    public Student(String name, int age, int year, int idNumber, String major){
        super(name, age);
        this.year = year;
        this.idNumber = idNumber;
        this.major = major;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getMajor() {
        return major;
    }

    @Override
    public String toString() {
        return "Student Information:\n" +
               "Name: " + this.getName() +
               ", Age: " + this.getAge() +
               ", Year: " + year +
               ", ID Number: " + idNumber +
               ", Major: " + major + "\n";
    }
}
