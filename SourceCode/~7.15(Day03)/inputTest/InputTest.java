package inputTest;

import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) {
//		초기값
// 		정수 : 0
//		실수 : 0.0
//		문자 : ''
//		문자열 : null or ""
		Scanner sc = new Scanner(System.in);
		String name=null;
		
		System.out.print("이름 : ");
		name = sc.nextLine();
		System.out.println(name + "님 환영합니다.");
		
		int age = 0;
		
		System.out.print("나이 :");
		age = sc.nextInt();
		System.out.println(age + "살");

	}
}
