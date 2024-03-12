package javaz.api;

//String 
//- 문자열을 표현하고 처리하는 클래스 
//- 저장된 리터럴은 내용이 변하는 않는 상수 객체
//  - 동일 리터럴(값)은 상수 풀constant pool에 1개가 생성되어 공유
//  - 내용이 변경되면 수정되지 않고,
//    새로운 인스턴스가 생성됨
//- 문자열 변경이 빈전한 경우 
//  StringBuffer(thread-safe) 또는
//  StringBuilder(non thread-safe)를 권장
//- 기본형처럼 사용 가능

public class StringMain {
	static String nullStr;
	static String emptyStr = "";
	
	public static void main(String[] args) {
		System.out.println(nullStr);
		System.out.println(emptyStr);
		System.out.println("|" + nullStr + "|");
		System.out.println("|" + emptyStr + "|");	
//		System.out.println(emptyStr.charAt(0));
//		StringIndexOutOfBoundsException 발생
		
//		System.out.println(nullStr.charAt(0));	
//		NullPointerException 발생

		System.out.println();
		String pw1 = "password 123 ";
		String pw2 = "PASSWORD 123 ";
		System.out.println(pw1.length());
		System.out.println(pw2.length());
		
		//문자열 비교 -------------------------------------
		System.out.println(pw1.equals(pw2)); //pw1과 pw2가 같은지 비교
		System.out.println(pw1.equalsIgnoreCase(pw2));//         "         -대소문자 구분 X
		System.out.println();
		
		//문자열 검색 ---------------------------------
		//0 1 2 3 4 5 6 7 8 9 10 11 12
		//p a s s w o r d _ 1  2  3  _
		System.out.println(pw1.indexOf("a"));
		System.out.println(pw1.indexOf("x"));
		System.out.println(pw1.indexOf("s"));
		System.out.println(pw1.lastIndexOf("s"));
		System.out.println(pw1.indexOf("word"));
		System.out.println(pw1.indexOf("java"));
		System.out.println();
		
		//문자열 추출  ---------------------------------
		//0 1 2 3 4 5 6 7 8 9 10 11 12
		//p a s s w o r d _ 1  2  3  _
		System.out.println(pw1.charAt(4));
		System.out.println(pw1.substring(9));
		System.out.println(pw1.substring(4, 8));
		System.out.println(pw1.substring(pw1.indexOf("p"),
										 pw1.lastIndexOf("s") + 1 ));
		System.out.println();
		String[] strs = pw1.split(" ");
		System.out.println(strs.length); //strs 배열의 길이 출력
		for (String s : strs) {
			System.out.println(s);//strs 배열의 값을 화면 출력
		}
		System.out.println();
		pw2 = "HELLO#password-1234,5678";
		strs = pw2.split("#|-|,");
		for (String s : strs) {
			System.out.println(s);
		}
		System.out.println();
		
		//문자열 변환 ----------------------------------
		System.out.println(pw1);
		System.out.println(pw1.replace("word", "port"));
		System.out.println(pw1);
		System.out.println(pw1.toUpperCase());
		System.out.println(pw1.length());
		System.out.println(pw1.trim().length());
		System.out.println();
		System.out.println(pw1 + 456);
		System.out.println(pw1.concat("456"));
		System.out.println(pw1.trim() + 456);
		System.out.println(pw1.replace(" ", "") + 456);
		System.out.println();
		
		//정수 123을 문자열로 변환하여 화면에 표시
		//실수 3.14를 문자열로 변환하여 화면에 표시
		//"3은 4보다 크다"를 비교한 결과를 문자열로 변환하여 화면에 표시 
		//정수 삼백억을 문자열로 변환하여 화면에 표시
		System.out.println(String.valueOf(123));
		System.out.println(String.valueOf(3.14));
		System.out.println(String.valueOf(3>4));
		System.out.println(30000000000L + "");
	}

}




















