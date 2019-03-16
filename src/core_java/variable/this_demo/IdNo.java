package core_java.variable.this_demo;

public class IdNo {

	private Person person;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		
		if(this.person != null) {
			this.person.setIdNo(null);
		}
		
		this.person = person;
		person.setIdNo(this);
	}

}
