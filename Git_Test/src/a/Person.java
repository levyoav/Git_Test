package a;

public class Person {
	
	private int age;
	private String name;
	
	public Person() {
		this.age = 34;
		this.name = "Yoav";
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}
	
}
