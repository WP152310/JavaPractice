/**
 * 
 */
package org.dimigo.basic;

import java.util.Random;
import java.util.Scanner;

/**
 * <pre>
 * &#64;ProjectName	: JavaPractice
 * &#64;TypeName	: Loop
 * &#64;Description	: 
 * &#64;Date		: Mar 15, 2017
 * </pre>
 * 
 * @author : freiy
 * @version : 1.0
 */
public class Loop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice = 0;
		Scanner scan = new Scanner(System.in);
		int attack = 100;
		String[] classList = { "마법사", "영주", "기사", "농민" };
		do {
			System.out.println("------------");
			System.out.println("<< 게임 메뉴 >>");
			System.out.println("1. 공격력 증가");
			System.out.println("2. 공격력 감소");
			System.out.println("3. 캐릭터 설정");
			System.out.println("9. 종료");
			System.out.println("------------");
			System.out.print("메뉴 입력 =>");
			choice = scan.nextInt();
			switch(choice)
			{
			case 1:
				attack+=10;
				System.out.printf("공격력이 증가되었습니다. 현재 공격력 : %d\n", attack);
				break;
			case 2:
				attack-=10;
				System.out.printf("공격력이 감소되었습니다. 현재 공격력 : %d\n", attack);
				break;
			case 3:
				System.out.printf("%s(으)로 설정되었습니다.\n", classList[new Random().nextInt(classList.length)]);
				break;
			default:
			}
		} while (choice != 9);
		scan.close();
		System.out.println("이제 공부하세요!");
	}

}
