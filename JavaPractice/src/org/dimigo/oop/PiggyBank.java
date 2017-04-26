/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * &#64;ProjectName	: JavaPractice
 * &#64;TypeName	: PiggyBank
 * &#64;Description	: 
 * &#64;Date		: Apr 19, 2017
 * </pre>
 * 
 * @author : freiy
 * @version : 1.0
 */
public class PiggyBank {
	private static int balance;

	public static void putMoney(FamilyMember member, int amount) {
		balance += amount;
		System.out.println(member.getMemberName() + ": " + amount + "원 넣음");
	}

	public static void printBalance() {
		System.out.println("돼지저금통 총 금액: " + balance + "원");
	}
	
	
}
