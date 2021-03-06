/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * &#64;ProjectName	: JavaPractice
 * &#64;TypeName	: PiggyBankTest
 * &#64;Description	: 
 * &#64;Date		: Apr 19, 2017
 * </pre>
 * 
 * @author : freiy
 * @version : 1.0
 */
public class PiggyBankTest {
	public static void main(String[] args) {
		FamilyMember[] family = { new FamilyMember("아빠"), new FamilyMember("엄마"), new FamilyMember("나"),
				new FamilyMember("남동생") };
		FamilyMember.printMemberCnt();
		PiggyBank.putMoney(family[0], 10000);
		PiggyBank.putMoney(family[1], 5000);
		PiggyBank.putMoney(family[2], 2000);
		PiggyBank.putMoney(family[3], 1000);
		PiggyBank.printBalance();
		PiggyBank.putMoney(family[2], 1000);
		PiggyBank.printBalance();
	}
}
