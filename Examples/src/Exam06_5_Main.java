
public class Exam06_5_Main {
	public static void main(String[] args) {
		//헌혈자 정보
		Exam06_5_Human human = new Exam06_5_Human();// 클래스1 가져오고
		
		human.setName("김");
		human.setType('O');
		human.setAge(20);
		
		//BloodHouse 객체 생성
		Exam06_5_BloodHouse bh = new Exam06_5_BloodHouse(); //클래스2 가져오고
		String result = bh.action(human);//메소드 action을 블러드하우스로 넘김.
		System.out.println(result);
		//action() 메소드를 호출하면서
		
	}

}
