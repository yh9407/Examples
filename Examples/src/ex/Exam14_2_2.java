package ex;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Exam14_2_2 {
	public static void main(String[] args) {
		try {
			Reader r = new FileReader("string_data.txt");
			while (true) {
				int data = r.read();
				if (data == -1)
					break;
				System.out.print((char)data);
			}

			r.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/* Reader�� read �޼ҵ� ��� */
		/* try ? catch ? finally ����ó�� */ catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}