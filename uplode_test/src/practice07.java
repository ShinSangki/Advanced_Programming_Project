//문자열 거꾸로 출력하기
public class practice07 {

	public static void main(String[] args) {
		//"블랙핑크" 라는 문자열 변수 ss에 저장하고 출력
		String ss = "블랙핑크";
		System.out.println("원본 문자열 ==> " + ss);
		
		//거꾸로 출력될 문자열 표시하기 위한 print
//		System.out.println("반대 문자열 ==> ");
		System.out.println("반대 문자열 ==> ");
		
		//문자열의 길이가 4임 = index3값부터 역으로 출력
		System.out.print(ss.charAt(3));
		System.out.print(ss.charAt(2));
		System.out.print(ss.charAt(1));
		System.out.print(ss.charAt(0));
	}

}
//뒤집어진 문자열이 표시 문자열과 줄바꿈 되어 나옴..
//"반대 문자열"이 표시된 행에서 println -> print로 변경