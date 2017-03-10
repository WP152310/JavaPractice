/**
 * 
 */
package org.dimigo.basic;

/**
 * <pre>
 * @ProjectName	: JavaPractice
 * @TypeName	: Operator
 * @Description	: 
 * @Date		: Mar 10, 2017
 * </pre>
 * @author		: freiy
 * @version		: 1.0
 */
public class Operator {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a=5,b=2;
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(a*b);
			System.out.println(a/b);
			System.out.println(a%b);
			
			//문제)2.5가 나오게 하려면
			System.out.println((double)a/ b);
//			System.out.println(a/0);
			
			//다른 타입간의 연산(큰 타입으로 자동 변환)
			int i=10;
			double d = 3.14;
			int r1 = (int)(i+d);
			System.out.println(r1);
			
			//int보다 작은 타입간의 연산(int 타입으로 자동 변환)
			short s1 = 1, s2 = 2;
			short r2 = (short) (s1+s2);
			
			int aa=10,bb=10;
			r1=aa+++10;
			
			//Short-Circuit 테스트
			// or 연산은 true가 될 가능성이 높은 것을 먼저 작성
			boolean flag = true;
			a = 10;
			b = 0;
			if(flag || (a/b == 0)){
				System.out.println("OR 연산");
			}
			
			//and 연산으ㄴ false가 될 가능성이 높은 것을 먼저 작성
			if(!flag && (a/b == 0)){
				System.out.println("AND 연산");
			}
			
			//4. 문자열 연결 연산자
			String school = "디미고";
			int grade = 2;
			int classNum = 3;
			String name= "나자바";
			System.out.println(school+grade+classNum+name);
			System.out.println(grade + classNum + school + name);
			//문제 23디미고나자바를 출력하려면
			
			System.out.println("" + grade + classNum + school + name);
	}

}
