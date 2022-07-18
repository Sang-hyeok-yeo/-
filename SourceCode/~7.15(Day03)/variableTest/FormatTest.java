package variableTest;

public class FormatTest {
	public static void main(String[] args) {

//	이름, 나이, 몸무게 저장할 변수 선언
	String name = "여상혁";
	int age = 27;
	double weight = 100.52;
//	printf를 쓰고 각 유형에 맞는 포맷을 써야함 문자열 %s 정수형 %d 실수형 %f 문자형 %c \n = 줄바꿈.
	System.out.printf("이름 : %s\n", name);
	System.out.printf("나이 : %d\n", age);
	System.out.printf("몸무게 : %.1f", weight);
		
	}
}
