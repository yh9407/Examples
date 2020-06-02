
public class Exam06_5_Human {
	char type;
	String name;
	int age;

	public char getType() {
		return type;
	}

	public void setType(char type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Exam06_5_Human [type=" + type + ", name=" + name + ", age=" + age + "]";
	}

}
