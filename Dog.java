public class Dog {
	public String breed;
	public String color;
	public int age;

	public Dog(String breed, String color, int age) {
		this.breed = breed;
		this.color = color;
		this.age = age;
	}

	public void bark() {
		System.out.printf("My breed is %s, my color is %s, "
				+ "and I'm %d years old", breed, color, age);
	}
}