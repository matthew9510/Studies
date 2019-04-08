public class Zoo{
    public static void main(String [] args){
        
        Fish fish1 = new Fish(1, "M", 2, "fish1");
        Bird bird1 = new Bird(3, "F", 4, "bird1");
        Chicken chick1 = new Chicken(5, "M", 6, "chick1");
        Crow crow1 = new Crow(7, "F", 8, "crow1");

        fish1.eat();
        bird1.sleep();
        chick1.eat();
        crow1.fly();

        Animal fish2 = new Fish(9, "M", 10, "fish2");
        Animal bird2 = new Bird(11, "F", 12, "bird2");
        Animal chick2 = new Chicken(13, "M", 14, "Chick2");
        Animal crow2 = new Crow(15, "F", 16, "crow2");
        
        // crow2.fly(); Note: crow2 can't access crow Object methods because of the reference type 
        
       // Fish fish3 = (Fish)fish2;

        Animal [] animals = {fish2, bird2, chick2, crow2};
        moveAnimals(animals);
    }

    public static void moveAnimals(Animal[] animals){
        for(int i = 0; i < animals.length; i++){
            animals[i].move();
        }
    }
}