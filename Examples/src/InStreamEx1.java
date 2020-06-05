import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InStreamEx1 {
	public static void main(String[] args) {
		try {
			InputStream in = new FileInputStream("num_data.txt");
			for(;;) {
				int data = in.read();
				if(data == -1) break;
				System.out.print(data+"\t");
			}
			in.close();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/* InputStream의 read 메소드 사용 */
		/* try ? catch ? finally 예외처리 */
	}
}
