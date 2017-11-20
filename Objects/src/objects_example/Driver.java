package objects_example;

public class Driver {
    public static void main(String[] args){
       Person personExample = new Person();
       Student studentExample = new Student("Matthew Hess", 22, 4, 818299658, "Computer Science");
       Staff staffExample = new Staff("Scott Lindeneau",34,"Teacher","Computer Science");
       Hourly hourlyExample = new Hourly("Tessa Robertson", 21, "Entry Level Designer", "Interior Designer", 36, 15);
       Salaried salariedExample = new Salaried();
       salariedExample.setName("John Doe");

       System.out.println(personExample.toString());
       System.out.println(studentExample.toString());
       System.out.println(staffExample.toString());
       System.out.println(hourlyExample.toString());
       System.out.println(salariedExample.toString());
    }
}