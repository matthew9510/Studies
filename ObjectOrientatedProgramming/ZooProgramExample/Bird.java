//public class Bird extends Animal implements IFlyable{ // not all birds fly
public class Bird extends Animal{ 
    
    public Bird(int age, String gender, double weight, String name){
        super(age, gender, weight, name);
    }

    public void move(){
        System.out.println(getName() + " is flapping wings...");
    }
}