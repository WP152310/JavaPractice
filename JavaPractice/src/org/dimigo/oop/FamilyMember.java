/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * &#64;ProjectName	: JavaPractice
 * &#64;TypeName	: FamilyMember
 * &#64;Description	: 
 * &#64;Date		: Apr 19, 2017
 * </pre>
 * 
 * @author : freiy
 * @version : 1.0
 */
public class FamilyMember {
	private static int memberCnt;
	private String memberName;

	public FamilyMember(String memberName) {
		this.memberName = memberName;
		memberCnt++;
	}

	public String getMemberName() {
		return memberName;
	}

	public static void printMemberCnt() {
		System.out.println("가족 총 인원 수: " + memberCnt + "명");
	}
}
