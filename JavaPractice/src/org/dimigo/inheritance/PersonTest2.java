package org.dimigo.inheritance;

public class PersonTest2 {

	public static void main(String[] args){
		Person[] people = {
				new Person("Tom"),
				new Korean("홍길동"),
				new Japanese("田中"),
				new Chinese("王明")
		};
		
		for(Person p : people){
			greeting(p);
		}
	}
	
	private static void greeting(Person p){
		System.out.println(p);
		p.sayHello();
		p.sayBye();
		System.out.println();
	}
}
