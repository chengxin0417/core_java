package core_java.oop.zoo.v2;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Feeder feeder = new Feeder();
		
		Animail dog = new Dog();
		Food bone = new Bone();
		feeder.feed(dog, bone);
		
		Animail cat = new Fish();
		Food fodder = new Fodder();
		feeder.feed(cat, fodder);
	}

}
