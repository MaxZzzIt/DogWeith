package by.home.maxzzzit;

public class TestDog {
	public static void main (String[]args) {
		Dog dog = new Dog();
		System.out.println("Ves dog iznathalnii "+ dog.getWeith());
		dog.setWeith(54);
		System.out.println("Ves dog vzrosloi "+ dog.getWeith());
		dog.setWeith(-15);

	}
}
