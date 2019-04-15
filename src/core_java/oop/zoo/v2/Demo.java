package core_java.oop.zoo.v2;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Feeder feeder = new Feeder();
		
		Animail fish = new Fish();
		Food fodder = new Fodder();
		feeder.feed(fish, fodder);
		
		Animail cat = new Cat();
		
		Food fishAsFood = new Fish();
		feeder.feed(cat, fishAsFood);
	}

}
