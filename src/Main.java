import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import java.util.Comparator;
//主函数
public class Main 
{
	public static void main(String[] args)
	{		
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				ArrayList<Student> students = new ArrayList<Student>();
				JFrame frame = new MainFrame(students);
				frame.setTitle("小学生四则运算");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
				frame.setLocationRelativeTo(null);
			}
			
		});
	}
}
