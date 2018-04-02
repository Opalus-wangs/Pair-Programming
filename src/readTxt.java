import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class readTxt {

	public  void Exception() throws IOException
	{
		File file = new File("D:\\www\\最终-评分系统3\\评分系统3\\result.txt");//Text文件
		BufferedReader br = new BufferedReader(new FileReader(file));//构造一个BufferedReader类来读取文件
		String s = null;
		while((s = br.readLine())!=null){
		System.out.println(s);
		
	}
		br.close();;
	}
	}
