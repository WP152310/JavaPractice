/*
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * &#64;ProjectName	: JavaPractice
 * &#64;TypeName	: PrimitiveDataType
 * &#64;Description	: 
 * &#64;Date		: Mar 13, 2017
 * </pre>
 * 
 * @author : freiy
 * @version : 1.0
 */
public class PrimitiveDataType {
	/*
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "아이유";
		boolean isMale = false;
		int age = 25;
		double height = 161.8;
		float weight = 44.3f;
		char bloodType = 'A';
		System.out.println("이름 : " + name);
		System.out.println(isMale ? "성별 : 남자" : "성별 : 여자");
		System.out.println("나이 : " + age + "살");
		System.out.println("키 : " + height + "cm");
		System.out.println("몸무게 : " + weight + "kg");
		System.out.println("혈액형 : " + bloodType + "형");
	}
}