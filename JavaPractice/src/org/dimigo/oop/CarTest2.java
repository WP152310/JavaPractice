/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * &#64;ProjectName	: JavaPractice
 * &#64;TypeName	: CarTest
 * &#64;Description	: 
 * &#64;Date		: 2017/03/23
 * </pre>
 * 
 * @author : freiy
 * @version : 1.0
 */
public class CarTest2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 car[] = { new Car2("현대자동차", "제네시스", "검정색", 225, 50000000), new Car2("기아자동차", "K7", "흰색", 246, 40000000),
				new Car2("삼성자동차", "SM7", "회색", 200, 38000000) };
		System.out.println("<< 자동차 목록 >>");
		for (int i = 0; i < car.length; i++) {
			System.out.println("제조사명 : " + car[i].getCompany());
			System.out.println("모델명 : " + car[i].getModel());
			System.out.println("색상 : " + car[i].getColor());
			System.out.printf("최대속도 : %dkm\n", car[i].getMaxSpeed());
			System.out.printf("가격 : %,d원\n", car[i].getPrice());
			System.out.println();
		}
	}

}
