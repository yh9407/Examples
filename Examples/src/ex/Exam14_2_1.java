package ex;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam14_2_1 {
	public static void main(String[] args) {
		try {
			String text = "Eighty percent of success is showing up.\n" + "������ 8���� �ϴ� �⼮�ϴ� ���̴� .";
			Writer r = new FileWriter("string_data.txt");
			r.write(text);
			r.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/* Writer�� write �޼ҵ� ��� */
		/* try ? cath ? finally ����ó�� */ catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
