package ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStreminFinally {
	public static void main(String[] args) {
		InputStream in = null;
		OutputStream out = null;
		try {
			in = new FileInputStream("c:/dev/os.txt");
			out = new FileOutputStream("c:/dev/copy_os.txt");
			int s = 0;
			while (true) {
				s = in.read();
				if (s == -1)
					break;
			}
			out.write(s);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
				}
			}
		}
	}
}
