
public class Exam06_5_BloodHouse {
	public boolean isPossible(Exam06_5_Human human) { 
		int age = 0; // �������� ���̸� Ȯ���Ͽ� ����//�ʱ�ȭ
		
		boolean isPossible = false; // ���� ���� ����
		age = human.getAge(); //age�� Exam06_5_Human ���� ��������
		
		if (age >=16 && age <=69) { //���ǹ�
			isPossible = true;
		} 
		return isPossible; //���� isPossible �� ����
	}

	public String action(Exam06_5_Human human) {
		boolean res = isPossible(human);
		String result = ""; // ���� ��� ����
		if(res) {
			result = "������ �Ϸ�Ǿ����ϴ�. XX�� �����մϴ�.";
		}else {
			result = "������ �Ұ����մϴ�.";
		}
		return result;
	}
}
