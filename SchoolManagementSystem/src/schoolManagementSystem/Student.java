package schoolManagementSystem;

public class Student {
	// attributes of class student
	private String name;
	private int age;
	
	//constructor
	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	// getter and setter for variable name
	public String getName() {
		return name;
	}

	
	// getter and setter for variable age
	public int getAge() {
		return age;
	}

}
