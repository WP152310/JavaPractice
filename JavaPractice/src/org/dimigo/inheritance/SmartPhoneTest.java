package org.dimigo.inheritance;

public class SmartPhoneTest {

	public static void main(String[] args) {
			SmartPhone[] mobiles = {
					new IPhone("iPhone 7", "애플", 900000),
					new Galaxy("갤럭시 S8", "삼성", 800000)
			};
			
			for(SmartPhone s : mobiles){
				System.out.println(s);
				s.turnOn();
				s.pay();
				s.useSpecialFunction(s);
				s.turnOff();
				System.out.println();
			}
	}

}
