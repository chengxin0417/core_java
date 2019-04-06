package core_java.modifier.static_modifier;

public class VoteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Voter v;
		for(int i = 0; i < 2; i++) {
			v = new Voter("张三"+i);
			v.vote();
		}
		v = new Voter("张三0");
		v.vote();
	}

}
