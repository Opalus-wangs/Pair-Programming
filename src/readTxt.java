import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class readTxt {

	public  void Exception() throws IOException
	{
		File file = new File("D:\\www\\����-����ϵͳ3\\����ϵͳ3\\result.txt");//Text�ļ�
		BufferedReader br = new BufferedReader(new FileReader(file));//����һ��BufferedReader������ȡ�ļ�
		String s = null;
		while((s = br.readLine())!=null){
		System.out.println(s);
		
	}
		br.close();;
	}
	}
