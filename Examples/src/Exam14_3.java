import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Exam14_3 {
	public static void main(String[] args) {
		InputStream in = null;
		OutputStream out = null;

		try {
			in = new FileInputStream("C:/Windows/System32/drivers/etc/hosts");
			out = new FileOutputStream("C:/dev/hosts");
			byte[] buffer = new byte[1024];
			while (true) {
				int data = in.read(buffer);
				if (data == -1)
					break;

			}
			out.write(buffer);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
					System.out.println("in완료");
				} catch (IOException e) {
				}
			}
			if (out != null) {
				try {
					out.close();
					System.out.println("out완료");
				} catch (IOException e) {
				}
			}
		}
	}
}