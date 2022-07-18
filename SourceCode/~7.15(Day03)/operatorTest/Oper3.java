package operatorTest;

import java.util.Scanner;

public class Oper3 {

	public static void main(String[] args) {
//	사용자에게 키를 입력받고, 정수라면 정수로 출력
//	실수라면 실수로 출력
// 183 > 183 출력
// 183.5 > 183.5 출력
// 삼항 연산자를 사용
//			height와 boolean값을 초기화한다
		   	  double height = 0.0;
		      boolean check = false;
		      String message = "키 : ", format = null;
		      char newLine = '\n';
		      Scanner sc = new Scanner(System.in);
		      
		      System.out.print(message);
		      height = sc.nextDouble();
		      
		      check = height - (int)height == 0;
		      
//		      System.out.println(check ? (int)height : height);
		      format = check ? "%.0fcm%c" : "%.2fcm%c";
		      System.out.printf(format, height, newLine);

	}
}
