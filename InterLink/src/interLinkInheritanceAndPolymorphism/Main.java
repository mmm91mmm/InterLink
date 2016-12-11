package interLinkInheritanceAndPolymorphism;

public class Main {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.characteristic("Rex", 20, "black", 20);
		System.out.println(dog);
		Cat cat = new Cat();
		Cow cow = new Cow();
		cow.characteristic(200, 2, 220, "white");
		System.out.println(cow);
		GermanShepherd germanShepherd = new GermanShepherd();
		Greyhound greyhound = new Greyhound();
		dog.voise();
		cat.voise();
		cow.voise();
		germanShepherd.voise();
		germanShepherd.job();
		greyhound.voise();
		greyhound.job();

		greyhound.setColour("gold");
		greyhound.setName("Mukhtar");
		greyhound.setSpeed(30);
		greyhound.setWeight(25);
		System.out.println(greyhound);
	}

}
