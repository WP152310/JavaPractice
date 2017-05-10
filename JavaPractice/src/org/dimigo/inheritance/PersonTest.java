package org.dimigo.inheritance;

public class PersonTest {

	public static void main(String[] args){
		Person tom = new Person("Tom");
		Korean hong = new Korean("홍길동");
		Japanese tanaka = new Japanese("田中");
		Chinese wang = new Chinese("王明");
		
		System.out.println(tom);
		System.out.println(hong);
		System.out.println(tanaka);
		System.out.println(wang);
		
		System.out.println();
		
		tom.sayHello();
		hong.sayHello();
		tanaka.sayHello();
		wang.sayHello();
		
		System.out.println();
		
		tom.sayBye();
		hong.sayBye();
		tanaka.sayBye();
		wang.sayBye();
		
	}
}
