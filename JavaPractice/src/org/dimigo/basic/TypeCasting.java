/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * @ProjectName	: JavaPractice
 * @TypeName	: TypeCasting
 * @Description	: 
 * @Date		: Mar 10, 2017
 * </pre>
 * @author		: freiy
 * @version		: 1.0
 */
public class TypeCasting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Hello world!");
			//1. 자동형변환 : 작은타입 -> 큰타입 (Promotion)
			byte b = 10;
			int i = b;
			System.out.println(b);
			System.out.println(i);
			
			//2. 강제형변환 : 큰타입 -> 작은타입(Casting)
			i = 20;
			b = (byte)i;
			System.out.println(b);
			System.out.println(i);
			
			//수의 범위에 주의
			i = 128;
			b=(byte)i;
			System.out.println(b);
			System.out.println(i);
	}

}
