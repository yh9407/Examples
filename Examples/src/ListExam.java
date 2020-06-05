import java.util.ArrayList;

public class ListExam {
	public static void main(String[] args) {
		String[] company = { "Naver", "Kakao", "Google", "Amazon", "MS", "Facebook" };
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {
			int idx = (int) (Math.random() * company.length);
			list.add(company[idx]); // 랜덤 순번의 업체를 List로 추가
		}

		System.out.printf("추가된 회사 개수 : %s\n", list.size());
		System.out.println(list.toString());
		
		for (int i = list.size() -1 ; i>=0; i--) {    //[index out of bound] 하나가 사라지면 배열에 변화가 있음. 따라서  뒤에부터 시작
			String value = list.get(i);
			if(value.equals("Amazon") || value.equals( "Facebook")) {
				list.remove(i);
			}
				
		}
		
		
		System.out.printf("제거 후 회사 개수 : %s\n", list.size());
		System.out.println(list.toString());
	}
}
