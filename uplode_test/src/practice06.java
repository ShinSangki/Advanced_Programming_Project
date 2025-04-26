//기말 평균 학점 구하기
public class practice06 {

	public static void main(String[] args) {
		//평균값을 넣을 변수 설정
		double average;
		
		//3개의 이수학점을 각각의 변수에 넣어 저장
		int java = 3, mobile = 2, excel = 1;
		
		//점수별 대응하는 학점 넣어 선언
		double A = 4.5, A0 = 4.0, b = 3.5;
		
		//(과목 * 점수) 더하고 총학점 나누기.
		average = ((java*b) + (mobile*A0) + excel*A) / (java + mobile + excel);
		
		//소수점 줄째자리수 까지 출력(Math.round메서드 사용)
		average = Math.round(average*100.0) / 100.0;
		
		//평균 학점 출력
		System.out.println("평균학점 : " + average);
		
	}

}
