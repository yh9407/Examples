package ex;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
//���ڸ� �ȱ����� �� �о��.
public class Read {
	public static void main(String[] args) {
		try {
			Reader r = new FileReader("c:/dev/os.txt");
			while (true) {
				int data = r.read();
				if (data == -1)
					break;
				System.out.println(data);
				
			}
			r.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
