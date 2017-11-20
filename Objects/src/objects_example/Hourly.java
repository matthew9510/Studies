package objects_example;

public class Hourly extends Staff{
    private int hoursWorked;
    private double hourlyRate;

    public Hourly() {
        super();
        hoursWorked = 0;
        hourlyRate = 0.0;
    }

    public Hourly (String name, int age, String jobTitle, String department, int hoursWorked, double hourlyRate) {
        super(name, age, jobTitle, department);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHourlyRate (double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getHourlyRate () {
        return hourlyRate;
    }

    @Override
    public double pay() {
        return ((double)hoursWorked * hourlyRate);
    }

    @Override
    public String toString() {
        return "Hourly Staff Information:\n" +
               "Name: " + this.getName() +
               ", Age: " + this.getAge() +
               ", Job Title: " + this.getJobTitle() +
               ", Department: " + this.getDepartment() +
               ", Hours Worked: " + hoursWorked +
               ", Hourly Rate: $" + hourlyRate +
               ", Monthly Income: $" + pay() + "\n";
    }
}
