package objects_example;

public class Person {
    private int age;
    private String name;

    public Person(){
        name = "not yet specified";
        age = 1;
    }

    public Person (String name,int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    //Method to display the attribute values of this Object
    @Override // Inherited from the Object class.
    public String toString() {
        return "Person Information:\n" +
               "Name: " + this.getName() +
               ", Age: " + this.getAge() + "\n";
    }
}
