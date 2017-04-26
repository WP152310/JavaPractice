package inheritance;

public class Chinese extends Person {

	public Chinese(String name) {
		super(name);
	}

	public void sayHello() {
		System.out.println("你好");
	}

	public void sayBye() {
		System.out.println("再见");
	}

	public String toString() {
		return "저는 중국사람 " + getName() + "입니다.";
	}

}
