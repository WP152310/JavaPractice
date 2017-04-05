/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * &#64;ProjectName	: JavaPractice
 * &#64;TypeName	: SnackTest
 * &#64;Description	: 
 * &#64;Date		: 2017/04/05
 * </pre>
 * 
 * @author : freiy
 * @version : 1.0
 */
public class SnackTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Snack[] snacks = { new Snack("새우깡", "농심", 1100, 2), new Snack("콘칩", "크라운", 1200, 1),
				new Snack("허니버터칩", "해태", 1500, 4) };
		int sum = 0;
		for (Snack i : snacks) {
			System.out.println(i);
			sum += i.getPrice() * i.getNumber();
		}
		System.out.println("총 구매 금액 : " + String.format("%,d원", sum));
	}

}
