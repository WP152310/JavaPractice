/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 * @ProjectName	: JavaPractice
 * @TypeName	: IdolGroup
 * @Description	: 
 * @Date		: Apr 7, 2017
 * </pre>
 * @author		: freiy
 * @version		: 1.0
 */
public class IdolGroup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] groupName = {"빅뱅", "2NE1", "걸스데이"};
		String[][] memberName = {
				{"GD", "태양", "대성", "탑", "승리"},
				{"CL", "산다라박", "박봄", "민지"},
				{"유라", "혜리", "소진", "민아"}
		};
		for(int i=0;i<groupName.length;i++){
			System.out.printf("<<%s>>\n", groupName[i]);
			for(String j:memberName[i]){
				System.out.println(j);
			}
			System.out.println();
		}
	}

}
