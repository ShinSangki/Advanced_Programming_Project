//대*소문자 변환하기
public class practice08 {

	public static void main(String[] args) {
		//원본 문자열을 변수 ss에 저장 후 출력
		String ss = "Java";
		System.out.println("원본 문자열 ==>" + ss);
		
		//변환된 문자열 저장할 빈 문자열 변수 선언
		String newSS = "";
		
		//첫 글자 대문자 -> 소문자 변경 toLowerCase()
		newSS = ss.substring(0,1).toLowerCase();
		
		//두 번째~ 소문자 -> 대문자 변경 toUpperCase()
		newSS += ss.substring(1,2).toUpperCase();
		newSS += ss.substring(2,3).toUpperCase();
		newSS += ss.substring(3,4).toUpperCase();
		
		//변환된 문자열 출력
		System.out.println("변환 문자열 ==> "+ newSS);

	}

}
