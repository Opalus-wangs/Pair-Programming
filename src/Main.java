/**
 * �����������
 * @author penghui
 *
 */
import java.awt.*;
import java.util.ArrayList;

import javax.swing.*;

import java.util.Comparator;
public class Main 
{
	public static void main(String[] args)
	{		
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				ArrayList<Actor> actors = new ArrayList<Actor>();
				JFrame frame = new MainFrame(actors);
				frame.setTitle("Сѧ����������");
				frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				frame.setVisible(true);
				frame.setLocationRelativeTo(null);
			}
			
		});
	}
}
