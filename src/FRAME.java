import java.util.*;
import javax.swing.*;
//�鿴��Ϣ
import java.awt.BorderLayout;
import java.awt.GridLayout;
public class FRAME extends JFrame
{
		private JTextArea out1 = new JTextArea();
		private JLabel pan1 = new JLabel();
		public FRAME(final JFrame win,final JPanel pan,final ArrayList<Student> students)
		{
			 win.getContentPane().remove(pan);
			 setLayout(new GridLayout(3,1));
			 JLabel lab5 = new JLabel("���");
			 JLabel lab6 = new JLabel("����");
			 JLabel lab7 = new JLabel("����");
			
			 lab5.setBounds(100,30,200,20);
			 lab6.setBounds(200,30,200,20);
			 lab7.setBounds(300,30,200,20);
			 //�����в������ѧ������Ϣ���
			 for(int i = 0; i< students.size();i++)
			 {
				 out1.append(students.get(i).getid()+"                          "+students.get(i).getname()+"                          "+(20-students.get(i).getw())*5+"\n");				
			 }
			 win.add(out1);
			 out1.setBounds(100,60,280,250);
			 win.add(lab5);
			 win.add(lab6);
			 win.add(lab7);
			 win.add(pan);
			 win.add(pan,BorderLayout.SOUTH);
			 win.add(pan1);
			 win.setVisible(true);
		}
	}


