public abstract class Animal {
    private int age;
    private String gender;
    private double weight;
    private String name;

    public Animal(int age, String gender, double weight, String name){
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.name = name;
    }

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public double getWeight() {
		return this.weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
    }
    
    public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

    public void eat(){
        System.out.println(name + " is eating...");
    }

    public void sleep(){
        System.out.println(name + " is sleeping...");
    }

    public abstract void move();
}