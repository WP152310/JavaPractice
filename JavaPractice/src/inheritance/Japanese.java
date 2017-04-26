package inheritance;

public class Japanese extends Person {

	public Japanese(String name) {
		super(name);
	}

	public void sayHello() {
		System.out.println("おはよう");
	}

	public void sayBye() {
		System.out.println("さようなら");
	}

	public String toString() {
		return "저는 일본사람 " + getName() + "입니다.";
	}

}
