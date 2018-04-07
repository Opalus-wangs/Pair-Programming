import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
//读取文件
public class Readtext {

	public  void Exception() throws IOException
	{
		File file = new File("F:\\小学生四则运算\\小学生四则运算\\Text.txt");//Text文件
		BufferedReader br = new BufferedReader(new FileReader(file));//构造一个BufferedReader类来读取文件
		String s = null;
		while((s = br.readLine())!=null)
		{
			System.out.println(s);
		}
		br.close();;
	}
}
