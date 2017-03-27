/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * @ProjectName	: JavaPractice
 * @TypeName	: CarTest
 * @Description	: 
 * @Date		: 2017/03/23
 * </pre>
 * @author		: freiy
 * @version		: 1.0
 */
public class CarTest3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car3 car[] = {new Car3("현대자동차", "제네시스", "검정색", 225, 50000000), new Car3("기아자동차", "K7", "흰색", 246), new Car3("삼성자동차", "SM7", "회색")};
		System.out.println("<< 자동차 목록 >>");
		for(int i=0;i<car.length;i++)
		{
			System.out.println("제조사명 : " + car[i].getCompany());
			System.out.println("모델명 : " + car[i].getModel());
			System.out.println("색상 : " + car[i].getColor());
			System.out.printf("최대속도 : %dkm\n" , car[i].getMaxSpeed());
			System.out.printf("가격 : %,d원\n" , car[i].getPrice());
			System.out.println();
		}
	}

}
