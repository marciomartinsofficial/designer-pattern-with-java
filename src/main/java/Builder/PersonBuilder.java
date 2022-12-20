package Builder;

public class PersonBuilder {
	
	private Person person = new Person();
	
	public PersonBuilder setNickName(String nickName) {
		person.setNickName(nickName);
		return this;
	}
	
	public PersonBuilder setAge(Integer age) {
		person.setAge(age);
		return this;
	}
	
	public PersonBuilder setHeight(Double height) {
		person.setHeight(height);
		return this;
	}
	
	public PersonBuilder setWeight(Double weight) {
		person.setWeight(weight);
		return this;
	}
	
	// name is not null.
	public Person createPerson(String name) {
		person.setName(name);
		Person createdPerson = person;
		person = new Person();
		
		return createdPerson;
	}
}
