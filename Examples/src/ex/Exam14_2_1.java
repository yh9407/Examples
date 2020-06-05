package ex;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Exam14_2_1 {
	public static void main(String[] args) {
		try {
			String text = "Eighty percent of success is showing up.\n" + "성공의 8할은 일단 출석하는 것이다 .";
			Writer r = new FileWriter("string_data.txt");
			r.write(text);
			r.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/* Writer의 write 메소드 사용 */
		/* try ? cath ? finally 예외처리 */ catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
