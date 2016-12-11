package interLinkInheritanceAndPolymorphism;

public class GermanShepherd extends Dog {

	@Override
	public void voise() {
		System.out.println("I am a german shepherd, i say - gav");
	}

	@Override
	public void job() {
		System.out.println("my job is to protect my house");
	}

	
}
