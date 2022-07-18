package inputTest;

import java.util.Scanner;

public class InputTask2 {

	public static void main(String[] args) {
//		3개의 정수를 한 번에 입력받은 후
//		3개의 정수의 곱 출력
//		과제
		   int firstNumber = 0, secondNumber = 0, lastNumber = 0, result = 0;
		   
			  String numberMsg = "3개의 정수를 입력하세요.";
		   		
			  Scanner sc = new Scanner(System.in);
		   
			  System.out.println(numberMsg);
		     
			  firstNumber = Integer.parseInt(sc.next());
		     
			  secondNumber = Integer.parseInt(sc.next());

			  lastNumber = Integer.parseInt(sc.next());	    
			  
			  result = firstNumber * secondNumber * lastNumber;     
			  System.out.printf("%d * %d * %d = %d", firstNumber, secondNumber, lastNumber, result);

	}
}
