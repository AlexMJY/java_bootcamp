package javaz.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//InputStreamReader : 바이트 입력 스트림 -> 문자 입력 스트림
//                    1byte             2byte
//OutputStreamWriter: 바이트 출력 스트림 -> 문자 출력 스트림
public class InputStreamReaderMain {
	public static void main(String[] args) throws IOException {
		//키보드 입력을 BufferedReader 객체 br로 연결
		
//		BufferedReader br = new BufferedReader(System.in); X
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		while(true) {
			System.out.print("단어 입력(종료는 /q) : ");
			String input = br.readLine();
			if(input.equals("/q")) {
				System.out.println("- 단어 입력 에코 종료 -");
				break;
			} else if(input.trim().isEmpty()) {
				System.out.println("단어가 입력되지 않았습니다.");
			} else { 
				System.out.println("단어 에코 : " + input);					
			}
			System.out.println();
		}
	}
}












