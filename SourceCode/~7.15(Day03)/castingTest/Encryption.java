package castingTest;

public class Encryption {

	public static void main(String[] args) {
		 // 비밀번호를 입력하고, 암호화될 패스워드를 초기화한다. 그리고 키 값을 정한다.(키 값은 절대상수로 final int를 사용한다)
		String Pw = "gksehdtjr";
		String encryptedPw = "";
		String decryptedPw = "";
		final int key = 3;
	      //i가 패스워드의 길이만큼 반복이 될때 i의 아스키코드값과 키값을 곱하고 문자형으로 강제 형변환 시킨다. (encryptedPw = 암호화된 비밀번호)
	      //비밀번호 한글자마다 있는 배열을 charAt로 숫자로 바꿔준후 키값을 곱한후에 다시 문자형으로 바꾸는 것.
	    for(int i=0; i<Pw.length(); i++) {
	    	encryptedPw += (char)(Pw.charAt(i)*key);
	    }
	    System.out.println(encryptedPw);
	      //i가 패스워드의 길이만큼 반복이 될때 i의 아스키코드값과 키값을 나누고 문자형으로 강제 형변환 시킨다. (decryptedPw = 암호화가 해제된 비밀번호)
	   for(int i=0; i<encryptedPw.length(); i++) {
		  decryptedPw += (char)(encryptedPw.charAt(i) / key);
	   }
	   System.out.println(decryptedPw);
	}
}
