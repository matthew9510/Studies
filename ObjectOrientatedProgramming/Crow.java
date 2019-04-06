public class Crow extends Bird implements IFlyable{
    
    public Crow(int age, String gender, double weight, String name){
        super(age, gender, weight, name);
    }
    
    public void fly(){
        System.out.println(getName() + " is flying high...");
    }
}