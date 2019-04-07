public class Fish extends Animal{
    public Fish(int age, String gender, double weight, String name){
        super(age, gender, weight, name);
    }
    
    public void move(){
        System.out.println(getName() + " is swimming...");
    }
}