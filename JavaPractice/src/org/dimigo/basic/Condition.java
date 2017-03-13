/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
	
/**
 * <pre>
 * &#64;ProjectName	: JavaPractice
 * &#64;TypeName	: Condition
 * &#64;Description	: 
 * &#64;Date		: Mar 13, 2017
 * </pre>
 * 
 * @author : freiy
 * @version : 1.0
 */
public class Condition {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// if ~ else
		// 선거권 연령 : 만 19세
		int age = 17;

		// 19세 이상이면 "투표하러 가세요", 미만이면 "선거권이 없네요"
		if (age >= 19) {
			System.out.println("투표하러 가세요");
		} else {
			System.out.println("선거권이 없네요");
		}

		// switch 문
		// 주사위 랜덤 뽑기(1~6)
		// System.out.println(new Random().nextInt(6) + 1); //0~5
		int num = new Random().nextInt(6) + 1;
		switch (num % 2) {
		case 0:
			System.out.println("짝수입니다");
			break;
		case 1:
			System.out.println("홀수입니다");
			break;
		default:
			System.out.println("넌 누구냐!!");
		}
	}

}
