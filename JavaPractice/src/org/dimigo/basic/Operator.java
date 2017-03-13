/**
 * 
 */
package org.dimigo.basic;
	
/**
 * <pre>
 * @ProjectName	: JavaPractice
 * @TypeName	: Operator
 * @Description	: 
 * @Date		: Mar 13, 2017
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
		int Money = 1700000;
		int NumberOfMen = 3;
		int NumberOfStore = 1500;  
		System.out.printf("월 평균 급여 : %,d원\n", Money);
		System.out.printf("점포 내 직원 수 : %d명\n", NumberOfMen);
		System.out.printf("점포 수 : %,d개\n\n", NumberOfStore);
		System.out.printf("연간 인건비 : %,d원\n", (long)Money*12*NumberOfMen*NumberOfStore);
	}

}
