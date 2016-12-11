package interLinkInheritanceAndPolymorphism;

public class Cow implements Pet{

	public int height;
	public int milkAtDay;
	public int weight;
	public String colour;

	public void characteristic(int height, int milkAtDay, int weight, String colour) {
		this.height = height;
		this.milkAtDay = milkAtDay;
		this.weight = weight;
		this.colour = colour;
	}

	@Override
	public void voise() {
		System.out.println("I am a cow i say - myyy");
		
	}

	@Override
	public void job() {
		
	}

	@Override
	public String toString() {
		return "Cow [height=" + height + " cm" + ", milkAtDay=" + milkAtDay +" l" + ", weight=" + weight + " kg"+ ", colour=" + colour + "]";
	}
}
