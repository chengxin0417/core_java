package core_java.oop.zoo;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Feeder feeder = new Feeder();
		
		Animal dog = new Dog();
		Food bone = new Bone();
		feeder.feed(dog, bone);
		
		Animal cat = new Cat();
		Food fish = new Fish();
		feeder.feed(cat, fish);
	}

}
