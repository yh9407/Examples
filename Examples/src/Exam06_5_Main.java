
public class Exam06_5_Main {
	public static void main(String[] args) {
		//������ ����
		Exam06_5_Human human = new Exam06_5_Human();// Ŭ����1 ��������
		
		human.setName("��");
		human.setType('O');
		human.setAge(20);
		
		//BloodHouse ��ü ����
		Exam06_5_BloodHouse bh = new Exam06_5_BloodHouse(); //Ŭ����2 ��������
		String result = bh.action(human);//�޼ҵ� action�� �����Ͽ콺�� �ѱ�.
		System.out.println(result);
		//action() �޼ҵ带 ȣ���ϸ鼭
		
	}

}
