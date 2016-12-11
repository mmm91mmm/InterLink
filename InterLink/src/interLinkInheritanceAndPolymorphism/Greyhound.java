package interLinkInheritanceAndPolymorphism;

public class Greyhound extends Dog {

	@Override
	public void voise() {
		System.out.println("I am a greyhound");
		super.voise();
	}

	@Override
	public void job() {
		System.out.println("my job is to hunt");
	}
	
	
}
