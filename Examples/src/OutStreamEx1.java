import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutStreamEx1 {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 4, 6, 7, 9, 11, 15, 26 };
		
		try {
			OutputStream out = new FileOutputStream("num_data.txt");
			for (int i = 0; i < nums.length; i++) {
				out.write(nums[i]);
			}
			
			out.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		/* OutputStream의 write 메소드 사용 */
		/* try ? catch ? finally 예외처리 */
	}
}
