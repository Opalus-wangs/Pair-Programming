import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
//��ȡ�ļ�
public class Readtext {

	public  void Exception() throws IOException
	{
		File file = new File("F:\\Сѧ����������\\Сѧ����������\\Text.txt");//Text�ļ�
		BufferedReader br = new BufferedReader(new FileReader(file));//����һ��BufferedReader������ȡ�ļ�
		String s = null;
		while((s = br.readLine())!=null)
		{
			System.out.println(s);
		}
		br.close();;
	}
}
