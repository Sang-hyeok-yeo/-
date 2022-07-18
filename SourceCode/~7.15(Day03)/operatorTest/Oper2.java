package operatorTest;

import java.util.Scanner;

public class Oper2 {

	public static void main(String[] args) {
		
		//둘 중 큰 수를 찾아야 한다.
		// 두 정수를 초기화 한다.
		int firstNumber = 0;
		int lastNumber = 0;
		 // boolean과 result값을 초기화 한다. boolean값 초기화 = false
	     boolean Bigger = false; boolean Same = false; String result = null;
	     //	두 정수 입력받기
	   Scanner sc = new Scanner(System.in);
	      firstNumber = sc.nextInt();
	      lastNumber = sc.nextInt();
	      Bigger = firstNumber > lastNumber;
	      Same = firstNumber == lastNumber;
	      
	      //삼항 연산자를 이용한다. 숫자들을 ""를 이용하여 문자열로 변환해서 오류가 나타나지 않게 한다.
	     result = Bigger ? "큰 수는 : "+firstNumber : Same ? "두 수가 같습니다." : "큰 수는 : "+lastNumber;
	     
	     System.out.println(result);
	}

}
