package objects_example;

public class Salaried extends Staff {
    private double annualSalary;
    private int yearsWorked;

    public Salaried() {
        super();
        annualSalary = 0.0;
        yearsWorked = 0;
    }

    public Salaried(String name, int age, String jobTitle, String department, double annualSalary, int yearsWorked) {
        super(name, age, jobTitle, department);
        this.annualSalary = annualSalary;
        this.yearsWorked = yearsWorked;
    }

    public void setAnnualSalary(double annualSalary) {
        this.annualSalary = annualSalary;
    }

    public double getAnnualSalary() {
        return annualSalary;
    }

    public void setYearsWorked(int yearsWorked) {
        this.yearsWorked = yearsWorked;
    }

    public int getYearsWorked() {
        return yearsWorked;
    }

    @Override
    public double pay() {
        return annualSalary + (double)yearsWorked * 0.05;
    }

    @Override
    public String toString() {
        return "Salaried Staff Information:\n" +
               "Name: " + this.getName() +
               ", Age: " + this.getAge() +
               ", Job Title: " + this.getJobTitle() +
               ", Department: " + this.getDepartment() +
               ", Annual Salary Rate: $" + annualSalary +
               ", Years Worked: " + yearsWorked +
               ", Annual Income: $" + pay() + "\n";
    }
}
