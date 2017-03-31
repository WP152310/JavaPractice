/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 * &#64;ProjectName	: JavaPractice
 * &#64;TypeName	: Question
 * &#64;Description	: 
 * &#64;Date		: 2017/03/31
 * </pre>
 * 
 * @author : freiy
 * @version : 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] questions = { "가장 좋아하는 프로그래밍 언어는? ", "가장 좋아하는 운영체제는? ", "가장 좋아하는 회사는? " };
		StringBuilder[] prints = { new StringBuilder(questions[0]), new StringBuilder(questions[1]),
				new StringBuilder(questions[2]) };
		String[] answers = { "C++", "Windows 10", "Microsoft" };
		String buff;
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < questions.length; i++) {
			System.out.println("" + (i + 1) + "." + questions[i]);
			buff = scan.nextLine();
			System.out.println(buff.equals(answers[i]) ? "정답입니다!" : "틀렸습니다!");
		}
		System.out.println("<<결과 출력>>");
		for (int i = 0; i < questions.length; i++) {
			System.out.println(prints[i].append(answers[i]));
		}
	}

}
