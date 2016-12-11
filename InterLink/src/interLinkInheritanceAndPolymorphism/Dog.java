package interLinkInheritanceAndPolymorphism;

public class Dog implements Pet {

	private String name;
	private int speed;
	private String colour;
	private int weight;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public void characteristic(String name, int speed, String colour, int weight) {
		this.name = name;
		this.speed = speed;
		this.colour = colour;
		this.weight = weight;
	}
	@Override
	public void voise() {
		System.out.println("I am a dog i say - gav");
	}
	public void job() {
		
	}
	
	@Override
	public String toString() {
		return "Dog [name=" + name + ", speed=" + speed +" km/h " + ", colour=" + colour + ", weight=" + weight + " kg"+ "]";
	}
	
	
}
