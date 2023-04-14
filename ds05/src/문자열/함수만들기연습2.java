package 문자열;

public class 함수만들기연습2 {

	public static void 화장하다() {
		System.out.println("화장1) 피부표현하기");
		System.out.println("화장2) 눈그리기");
		System.out.println("화장3) 입그리기");
	}
	public static void 밥먹기(String time) {
		System.out.println("식사1) 요리하기");
		System.out.println("식사2)"+time+" 밥먹기");

	}
	public static void 잠자기() {
		System.out.println("푹 자기");
	}
	public static void 운동하기(String location) {
		System.out.println("운동1) 운동화신기");
		System.out.println("운동2)"+location+"에서 빨리걷기");
	}
	
	public static void main(String[] args) {
		//내가 일어나서 하는 일.
		System.out.println("1. 세수하기");
		밥먹기("아침");
		운동하기("운동장");
		잠자기();
		밥먹기("점심");
		System.out.println("6. 외출준비");
		화장하다();
		밥먹기("저녁");
		운동하기("공원");
		잠자기();

	}

}
